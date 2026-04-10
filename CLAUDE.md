# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

`einvoice-transformer` (Maven groupId `com.finmatics.et`) is an extensible transformation engine for different eInvoicing formats. It defines a generic in-between format (based on UBL 2.1 Invoice, extended with custom Abacus fields) that all concrete formats convert to and from. This repository hosts only the core abstractions and the in-between format itself; concrete format converters live in downstream projects that depend on these modules.

- Java baseline: **17**
- Build tool: **Maven 3.6+**
- Parent: `com.helger:parent-pom` (Helger ph-commons ecosystem)

## Modules

- **`et-core`** — shared interfaces and domain types: `IDocumentFormat` / `DocumentFormat`, `ESyntaxType` (XML, JSON), `IDocumentFormatXML`, `JsonFinder`, and the SPI factory `ITransformToInbetweenFactoryXML` that downstream converters implement to plug into the engine.
- **`et-inbetween`** — the generic in-between format. The XSDs (`Abacus-Invoice-2.1.xsd`, `common/Abacus-Shared-Types.xsd`) live under `src/main/resources/schemas/`. JAXB classes are generated at build time into `target/generated-sources/xjc` (package `com.finmatics.et.inbetween.model.a21`). `A21Marshaller` is the JAXB marshaller; `A21NamespaceContext` and `A21Wrapper` are the supporting helpers.

`et-core` depends on `et-inbetween` (so the SPI factory can return an `A21InvoiceType`).

## Build & Test

```bash
mvn clean install          # full build (runs JAXB generation in et-inbetween)
mvn -pl et-inbetween -am verify
mvn -pl et-core -am test
mvn -Dtest=SPITest test    # single test class
```

The JAXB generation in `et-inbetween` is driven by `org.jvnet.jaxb:jaxb-maven-plugin` with the `ph-jaxb-plugin` extensions (`-Xph-annotate`, `-Xph-equalshashcode`, `-Xph-cloneable2`, etc.). When changing XSDs, regenerate by running the build — do not hand-edit `target/generated-sources/xjc`. The `oasis/` subdirectory of generated sources is intentionally deleted by `maven-antrun-plugin` (UBL types come from `ph-ubl21` instead of being regenerated locally).

## Architecture notes

- The in-between model (`A21InvoiceType`) extends UBL 2.1 with Abacus-specific element groups defined in `Abacus-Shared-Types.xsd`. Anything added to the inbetween schema must be reflected in the XSD first; the Java model is regenerated from it.
- Format-specific converters are pluggable via Java SPI: implementors provide an `ITransformToInbetweenFactoryXML` (or a JSON equivalent) and declare it through `META-INF/services`. `SPITest` in each module exercises the SPI registration via ph-commons' `MockSPIServiceRegistry`.
- `A21Marshaller` bundles the full XSD chain required for validation (CCTS, XML-DSig, XAdES 1.3.2/1.4.1, UBL 2.1 unqualified/common/extension components, Abacus shared types, A21 invoice).

## Coding conventions

This project follows the Helger / ph-commons house style (Hungarian notation with `m_`/`s_` prefixes, `I`/`E`/`Abstract` type prefixes, `_` prefix on private methods, JSpecify `@NonNull`/`@Nullable`, ph-commons `ICommonsList`/`CommonsArrayList` as return types, inline string concatenation in log statements rather than SLF4J `{}` placeholders, space before `(` and `<`, "ID" always uppercase). See `~/.claude/rules/naming.md` for the full ruleset — match the style of the surrounding file when editing.

Use the libraries the project already uses: `ph-commons`, `ph-jaxb`, `ph-ubl21`, ph-xsds-* . Do not introduce alternatives.

## Release / versioning

Releases are cut with the maven-release-plugin (`[maven-release-plugin] prepare release ...` commits). Current development version is tracked in the root `pom.xml` (`<version>` of `et-parent-pom`). Do not bump versions or run release goals unless explicitly asked.
