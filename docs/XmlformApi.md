# XmlformApi

All URIs are relative to *https://xmlformio.azure-api.net/xml*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginPost**](XmlformApi.md#loginPost) | **POST** /login | User Login |
| [**postFunctionjsontoxml**](XmlformApi.md#postFunctionjsontoxml) | **POST** /to-xml | FunctionJsonToXml |


<a id="loginPost"></a>
# **loginPost**
> LoginPost200Response loginPost(loginPostRequest)

User Login

Authenticates and returns a JWT token.

### Example
```java
// Import classes:
import io.ApiClient;
import io.ApiException;
import io.Configuration;
import io.models.*;
import io.xmlform.XmlformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://xmlformio.azure-api.net/xml");

    XmlformApi apiInstance = new XmlformApi(defaultClient);
    LoginPostRequest loginPostRequest = new LoginPostRequest(); // LoginPostRequest | 
    try {
      LoginPost200Response result = apiInstance.loginPost(loginPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XmlformApi#loginPost");
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
| **loginPostRequest** | [**LoginPostRequest**](LoginPostRequest.md)|  | |

### Return type

[**LoginPost200Response**](LoginPost200Response.md)

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

<a id="postFunctionjsontoxml"></a>
# **postFunctionjsontoxml**
> postFunctionjsontoxml(body)

FunctionJsonToXml

Converts provided XMLFOrm.io form data into XML

### Example
```java
// Import classes:
import io.ApiClient;
import io.ApiException;
import io.Configuration;
import io.auth.*;
import io.models.*;
import io.xmlform.XmlformApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://xmlformio.azure-api.net/xml");
    

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    XmlformApi apiInstance = new XmlformApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      apiInstance.postFunctionjsontoxml(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling XmlformApi#postFunctionjsontoxml");
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

null (empty response body)

### Authorization

[OpenID](../README.md#OpenID), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns XML data |  -  |
| **401** | Not authenticated |  -  |
| **403** | Access token does not have the required scope |  -  |

