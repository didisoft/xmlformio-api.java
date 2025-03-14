# xmlform-io

Xmlform.io REST API

- API version: 1.0

- Build date: 2025-01-13T15:03:12.041513700+02:00[Europe/Bucharest]

- Generator version: 7.9.0

Xmlform.io REST API for working with web forms backed by XML data

  For more information, please visit [http://xmlform.io/contact](http://xmlform.io/contact)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.xmlform</groupId>
  <artifactId>xmlform-io</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.xmlform:xmlform-io:1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/xmlform-io-1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.*;
import io.auth.*;
import io.xmlform.*;
import io.xmlform.XmlformioApi;

public class XmlformioApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.xmlform.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        XmlformioApi apiInstance = new XmlformioApi(defaultClient);
        Object body = null; // Object | form data submitted from xmlform.io web form
        try {
            String result = apiInstance.formToXml(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlformioApi#formToXml");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.xmlform.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*XmlformioApi* | [**formToXml**](docs/XmlformioApi.md#formToXml) | **POST** /xml/v1/FormToXmlV1/ | Converts provided xmlform.io form data into XML document
*XmlformioApi* | [**jwtLogin**](docs/XmlformioApi.md#jwtLogin) | **POST** /jwt/ | JWT Token endpoint
*XmlformioApi* | [**xmlToForm**](docs/XmlformioApi.md#xmlToForm) | **POST** /xml/v1/XmlToFormV1/ | Converts provided XML document into xmlform.io form data


## Documentation for Models

 - [JwtLogin200Response](docs/JwtLogin200Response.md)
 - [JwtLoginRequest](docs/JwtLoginRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth


- **Type**: HTTP Bearer Token authentication (JWT)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@xmlform.io

