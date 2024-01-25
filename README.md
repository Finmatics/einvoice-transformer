# ET - EInvoice Transformer

An extensible transformation engine for different eInvoicing formats.

Latest release: **v0.2.3**

## Modules

* **`et-core`** - shared data structures used commonly over all converters
* **`et-inbetween`** - contains the generic in-between format to which all other formats are converted to and from. It is based on UBL 2.1 Invoice but extended with custom fields.

## Usage

### Maven coordinates

It is recommended to include the parent POM as a BOM like this (replace `x.y.z` with the correct version number):

```xml
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>com.finmatics.et</groupId>
        <artifactId>et-parent-pom</artifactId>
        <version>x.y.z</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
      ...
    </dependencies>
  </dependencyManagement>
```

## Building

* Requires Java 11 or higher
* Uses Apache Maven 3.6 or higher - `mvn clean install`

## News and Noteworthy

* v0.2.3 - 2024-01-25
    * Updated the Inbetween XSD to include Metering/ConsumptionHistory information
* v0.2.2 - 2024-01-25
    * Updated the Inbetween XSD to include Metering information
* v0.2.1 - 2023-09-17
    * Updated to ph-ubl 8.0.3
* v0.2.0 - 2023-05-24
    * Updated to Java 11 as the baseline
* v0.1.1 - 2021-10-22
     * Last version build with Java 1.8
* v0.1.0 - 2021-10-01
