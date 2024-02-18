package com.api.service.Service_AcBal_Published;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.apache.camel.Message;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.temenos.irf.integration.json.JSONHelper;

/**
 * TODO: Publisher Api for Ac Balance ENQUIRY
 *
 * @author MD Shibli Mollah
 *
 */
public class UpdateAcInfo implements Processor {

    /**
     * 
     */
    /*public UpdateAcInfo() {
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
                responseCode = jsonBody.get("response").toString();
                accountNo = jsonBody.get("accountId").toString();
                alternateAccountNo = jsonBody.get("accountIBAN").toString();
                currency = jsonBody.get("currency").toString();
                balance = jsonBody.get("availableBalance").toString();
            } catch (Exception e) {}
            
            jsonBody.remove("accountId");
            jsonBody.remove("accountIBAN");
           // jsonBody.remove("currency");
            jsonBody.remove("availableBalance");
            
            jsonBody.put("accountNo", accountNo);
            jsonBody.put("alternateAccountNo", alternateAccountNo);
            jsonBody.put("balance", balance);
            
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
