package com.api.service.GSIMSPublished;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.temenos.irf.integration.json.JSONHelper;

public class UpdateAccountInfo implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
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
            String bdMobile = null;
            String abroadMobile = null;
            
            try {
                responseCode = jsonBody.get("response").toString();
                accountNo = jsonBody.get("accountId").toString();
                bdMobile = jsonBody.get("mobileNumber").toString();
                abroadMobile = jsonBody.get("mobilePhoneNumber").toString();
            } catch (Exception e) {}
            
            jsonBody.remove("accountId");
            jsonBody.remove("mobileNumber");
            jsonBody.remove("mobilePhoneNumber");
            jsonBody.remove("response");
            
            jsonBody.put("accountNo", accountNo);
            jsonBody.put("bdMobile", bdMobile);
            jsonBody.put("abroadMobile", abroadMobile);
            
            jsonHeader.remove("audit");
            jsonHeader.remove("page_start");
            jsonHeader.remove("page_token");
            jsonHeader.remove("total_size");
            jsonHeader.remove("page_size");
            jsonHeader.remove("status");
            
            jsonHeader.put("statusCode", responseCode);
            updateResponse = "{\"header\":" + jsonHeader + ",\"body\":" + jsonBody + "}";
        }

        ObjectMapper om = JSONHelper.createObjectMapper();
        JsonNode modifiedResponse = om.readTree(updateResponse);
        in.setBody(modifiedResponse);
    }
}
