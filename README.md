# ET - EInvoice Transformer

An extensible transformation engine for different eInvoicing formats.

## Modules

* **`et-core`** - shared data structures used commonly over all converters
* **`et-inbetween`** - contains the generic in-between format to which all other formats are converted to and from. It is based on UBL 2.1 Invoice but extended with custom fields.

## Building

* Requires Java 1.8 or higher
* Uses Apache Maven 3.6 or higher - `mvn clean install`
