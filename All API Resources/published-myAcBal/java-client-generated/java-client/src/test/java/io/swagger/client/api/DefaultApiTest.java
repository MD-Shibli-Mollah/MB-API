/*
 * AcBal
 * AcBalance
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.AcBalResponse;
import io.swagger.client.model.BusinessQueryErrorResponse;
import io.swagger.client.model.QueryErrorResponse;
import io.swagger.client.model.SystemQueryErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAcBalTest() throws Exception {
        String accountId = null;
        Integer pageSize = null;
        Integer pageStart = null;
        String pageToken = null;
        String credentials = null;
        String companyId = null;
        String deviceId = null;
        String userRole = null;
        Boolean disablePagination = null;
        AcBalResponse response = api.getAcBal(accountId, pageSize, pageStart, pageToken, credentials, companyId, deviceId, userRole, disablePagination);

        // TODO: test validations
    }
    
}
