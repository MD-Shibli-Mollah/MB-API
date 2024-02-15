# DefaultApi

All URIs are relative to *http://localhost:9089/api/v1.0.0/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAcBal**](DefaultApi.md#getAcBal) | **GET** /party/accounts/{accountId} | 


<a name="getAcBal"></a>
# **getAcBal**
> AcBalResponse getAcBal(accountId, pageSize, pageStart, pageToken, credentials, companyId, deviceId, userRole, disablePagination)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKey
ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
apiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | Identifier of the account. Often referred to as the account number, yet for consistency this is always referred to as accountId. Accepts both IBAN & BBAN
Integer pageSize = 56; // Integer | The total number of records per page
Integer pageStart = 56; // Integer | The record from which the response should be displayed
String pageToken = "pageToken_example"; // String | Unique id expected to get as part of response from Transact on every enquiry request.
String credentials = "credentials_example"; // String | Username and password to authenticate the API against core-banking.
String companyId = "companyId_example"; // String | Identifier of the lead company of the underlying Entity/Company/Branch for the respective contract for customer data protection purposes. Example US0010001.
String deviceId = "deviceId_example"; // String | Identifies the device type
String userRole = "userRole_example"; // String | User who initiated the transaction
Boolean disablePagination = true; // Boolean | Indicates the pagination header attributes availability. If set to 'true', it fetches all the data
try {
    AcBalResponse result = apiInstance.getAcBal(accountId, pageSize, pageStart, pageToken, credentials, companyId, deviceId, userRole, disablePagination);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAcBal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Identifier of the account. Often referred to as the account number, yet for consistency this is always referred to as accountId. Accepts both IBAN &amp; BBAN |
 **pageSize** | **Integer**| The total number of records per page | [optional]
 **pageStart** | **Integer**| The record from which the response should be displayed | [optional]
 **pageToken** | **String**| Unique id expected to get as part of response from Transact on every enquiry request. | [optional]
 **credentials** | **String**| Username and password to authenticate the API against core-banking. | [optional]
 **companyId** | **String**| Identifier of the lead company of the underlying Entity/Company/Branch for the respective contract for customer data protection purposes. Example US0010001. | [optional]
 **deviceId** | **String**| Identifies the device type | [optional]
 **userRole** | **String**| User who initiated the transaction | [optional]
 **disablePagination** | **Boolean**| Indicates the pagination header attributes availability. If set to &#39;true&#39;, it fetches all the data | [optional]

### Return type

[**AcBalResponse**](AcBalResponse.md)

### Authorization

[apiKey](../README.md#apiKey), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

