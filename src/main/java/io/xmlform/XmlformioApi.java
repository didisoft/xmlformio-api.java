/*
 * Xmlform.io REST API
 * Xmlform.io REST API for working with web forms backed by XML data
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@xmlform.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.xmlform;

import com.fasterxml.jackson.core.type.TypeReference;

import io.ApiException;
import io.ApiClient;
import io.BaseApi;
import io.Configuration;
import io.Pair;

import io.xmlform.JwtLogin200Response;
import io.xmlform.JwtLoginRequest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-13T15:03:12.041513700+02:00[Europe/Bucharest]", comments = "Generator version: 7.9.0")
public class XmlformioApi extends BaseApi {

  public XmlformioApi() {
    super(Configuration.getDefaultApiClient());
  }

  public XmlformioApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Converts provided xmlform.io form data into XML document
   * Converts provided xmlform.io form data into XML document
   * @param body form data submitted from xmlform.io web form (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String formToXml(Object body) throws ApiException {
    return this.formToXml(body, Collections.emptyMap());
  }


  /**
   * Converts provided xmlform.io form data into XML document
   * Converts provided xmlform.io form data into XML document
   * @param body form data submitted from xmlform.io web form (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String formToXml(Object body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling formToXml");
    }
    
    // create path and map variables
    String localVarPath = "/xml/v1/FormToXmlV1/";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * JWT Token endpoint
   * Authenticates and returns a JWT token
   * @param jwtLoginRequest  (required)
   * @return JwtLogin200Response
   * @throws ApiException if fails to make API call
   */
  public JwtLogin200Response jwtLogin(JwtLoginRequest jwtLoginRequest) throws ApiException {
    return this.jwtLogin(jwtLoginRequest, Collections.emptyMap());
  }


  /**
   * JWT Token endpoint
   * Authenticates and returns a JWT token
   * @param jwtLoginRequest  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return JwtLogin200Response
   * @throws ApiException if fails to make API call
   */
  public JwtLogin200Response jwtLogin(JwtLoginRequest jwtLoginRequest, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = jwtLoginRequest;
    
    // verify the required parameter 'jwtLoginRequest' is set
    if (jwtLoginRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'jwtLoginRequest' when calling jwtLogin");
    }
    
    // create path and map variables
    String localVarPath = "/jwt/";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<JwtLogin200Response> localVarReturnType = new TypeReference<JwtLogin200Response>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Converts provided XML document into xmlform.io form data
   * Converts XML document into form data, ready for editing in an xmlform.io web form. #Example code Example code for various languages can be found at [Xml to Form examples](https://xmlform.io/docs/xml-to-form) 
   * @param body  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String xmlToForm(String body) throws ApiException {
    return this.xmlToForm(body, Collections.emptyMap());
  }


  /**
   * Converts provided XML document into xmlform.io form data
   * Converts XML document into form data, ready for editing in an xmlform.io web form. #Example code Example code for various languages can be found at [Xml to Form examples](https://xmlform.io/docs/xml-to-form) 
   * @param body  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String xmlToForm(String body, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling xmlToForm");
    }
    
    // create path and map variables
    String localVarPath = "/xml/v1/XmlToFormV1/";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    
    final String[] localVarAccepts = {
      "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "application/xml"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "bearerAuth" };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
