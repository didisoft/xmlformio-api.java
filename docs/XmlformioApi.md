# XmlformioApi

All URIs are relative to *https://api.xmlform.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**formToXml**](XmlformioApi.md#formToXml) | **POST** /xml/v1/FormToXmlV1/ | Converts provided xmlform.io form data into XML document |
| [**jwtLogin**](XmlformioApi.md#jwtLogin) | **POST** /jwt/ | JWT Token endpoint |
| [**xmlToForm**](XmlformioApi.md#xmlToForm) | **POST** /xml/v1/XmlToFormV1/ | Converts provided XML document into xmlform.io form data |



## formToXml

> String formToXml(body)

Converts provided xmlform.io form data into XML document

Converts provided xmlform.io form data into XML document

### Example

```java
// Import classes:
import io.ApiClient;
import io.ApiException;
import io.Configuration;
import io.auth.*;
import io.models.*;
import io.xmlform.XmlformioApi;

public class Example {
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

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**| form data submitted from xmlform.io web form | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns XML data |  -  |
| **401** | Not authenticated |  -  |
| **403** | Access token does not have the required scope |  -  |


## jwtLogin

> JwtLogin200Response jwtLogin(jwtLoginRequest)

JWT Token endpoint

Authenticates and returns a JWT token

### Example

```java
// Import classes:
import io.ApiClient;
import io.ApiException;
import io.Configuration;
import io.models.*;
import io.xmlform.XmlformioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.xmlform.io");

        XmlformioApi apiInstance = new XmlformioApi(defaultClient);
        JwtLoginRequest jwtLoginRequest = new JwtLoginRequest(); // JwtLoginRequest | 
        try {
            JwtLogin200Response result = apiInstance.jwtLogin(jwtLoginRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlformioApi#jwtLogin");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **jwtLoginRequest** | [**JwtLoginRequest**](JwtLoginRequest.md)|  | |

### Return type

[**JwtLogin200Response**](JwtLogin200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful login and JWT token return |  -  |
| **401** | Unauthorized - Invalid Client id or Client secret |  -  |
| **400** | Bad Request - Missing parameters or invalid format |  -  |


## xmlToForm

> String xmlToForm(body)

Converts provided XML document into xmlform.io form data

Converts XML document into form data, ready for editing in an xmlform.io web form. #Example code Example code for various languages can be found at [Xml to Form examples](https://xmlform.io/docs/xml-to-form) 

### Example

```java
// Import classes:
import io.ApiClient;
import io.ApiException;
import io.Configuration;
import io.auth.*;
import io.models.*;
import io.xmlform.XmlformioApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.xmlform.io");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        XmlformioApi apiInstance = new XmlformioApi(defaultClient);
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.xmlToForm(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling XmlformioApi#xmlToForm");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **String**|  | |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns XML data |  -  |
| **401** | Not authenticated |  -  |
| **403** | Access token does not have the required scope |  -  |

