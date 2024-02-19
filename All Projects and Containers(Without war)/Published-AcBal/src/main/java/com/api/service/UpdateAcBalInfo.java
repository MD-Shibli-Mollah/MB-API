package com.api.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.apache.camel.Message;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.temenos.irf.integration.json.JSONHelper;

/**
 * TODO: Publisher API for AcBalance Service Project
 *
 * @author MD Shibli Mollah
 *
 */
public class UpdateAcBalInfo implements Processor {

    /**
     * 
     */
    /*public UpdateAcBalInfo() {
        // TODO Auto-generated constructor stub
    }*/

    @Override
    public void process(Exchange exchange) throws Exception {
     // TODO Auto-generated method stub
        String HttpResponseCode = exchange.getIn().getHeaders().get("CamelHttpResponseCode").toString();
        Message in = exchange.getIn();
        String response = (String) in.getBody(String.class);
        JSONObject jsonObject = new JSONObject(response);
        JSONObject jsonHeader = jsonObject.getJSONObject("header");
        String updateResponse = null;
        
        if (HttpResponseCode.equals("200")) {
            
            JSONObject jsonBody = jsonObject.getJSONArray("body").getJSONObject(0);
            String responseCode = null;
            String accountNo = null;
            String alternateAccountNo = null;
            String currency = null;
            String balance = null;
            
            try {
                // fetching the value from key-value pair
                /*responseCode = jsonBody.get("response").toString();
                accountNo = jsonBody.get("accountId").toString();
                alternateAccountNo = jsonBody.get("accountIBAN").toString();
                currency = jsonBody.get("currency").toString();
                balance = jsonBody.get("availableBalance").toString();
                */
                // Make sure to check if the key exists before retrieving the value.
                responseCode = jsonBody.has("response") ? jsonBody.get("response").toString() : null;
                accountNo = jsonBody.has("accountId") ? jsonBody.get("accountId").toString() : null;
                alternateAccountNo = jsonBody.has("accountIBAN") ? jsonBody.get("accountIBAN").toString() : null;
                currency = jsonBody.has("currency") ? jsonBody.get("currency").toString() : null;
                balance = jsonBody.has("availableBalance") ? jsonBody.get("availableBalance").toString() : null;

            } catch (Exception e) {}
      // Modify the Provider Response ***      
            // Removing the key-value
            jsonBody.remove("accountId");
            jsonBody.remove("accountIBAN");
            jsonBody.remove("currency");
            jsonBody.remove("availableBalance");
            
            jsonBody.put("accountNo", accountNo);
            jsonBody.put("alternateAccountNo", alternateAccountNo);
            jsonBody.put("balance", balance);
            
            // jsonHeader.put(key, value)
            jsonHeader.remove("audit");
            jsonHeader.remove("page_start");
            jsonHeader.remove("page_token");
            jsonHeader.remove("total_size");
            jsonHeader.remove("page_size");
            jsonHeader.remove("status");
            
            jsonHeader.put("statusCode", responseCode);
            
           // updateResponse = "{\"header\":" + jsonHeader + ",\"body\":" + jsonBody + "}";
   // Constructing the updateResponse JSON object might not be handled correctly. 
   //         Instead of manually constructing the JSON string, consider using the JSONObject directly.
            JSONObject updateResponseObject = new JSONObject();
            updateResponseObject.put("header", jsonHeader);
            updateResponseObject.put("body", jsonBody);
            updateResponse = updateResponseObject.toString();
        }

       // ObjectMapper om = JSONHelper.createObjectMapper();
        ObjectMapper om = new ObjectMapper();
        JsonNode modifiedResponse = om.readTree(updateResponse);
        in.setBody(modifiedResponse);
    }

}
