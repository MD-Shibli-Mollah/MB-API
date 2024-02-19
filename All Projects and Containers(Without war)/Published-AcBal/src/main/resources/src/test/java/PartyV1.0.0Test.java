import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.junit.Test;

import org.junit.BeforeClass;
import com.temenos.irf.testsupport.*;


public class PartyV1.0.0Test extends CamelRouteTest
{

 private static CamelUnitTestHelper helper;
@BeforeClass
public static void init() {
   helper = new CamelUnitTestHelper("party-v1.0.0.service.v1.0.0", "./src/test/resources/test-data/");
}
@Test
public void testgetAcBal() {
  String requestName = "getAcBal";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("accountId", "");// THIS IS REQUIRED
headers.put("page_size", "");
headers.put("page_start", "");
headers.put("page_token", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put("disablePagination", "");
headers.put(Exchange.HTTP_METHOD, "GET");
String body = "";
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-v1.0.0.getAcBal", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
@Test
public void testgetAcBal() {
  String requestName = "getAcBal";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("accountId", "");// THIS IS REQUIRED
headers.put("page_size", "");
headers.put("page_start", "");
headers.put("page_token", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put("disablePagination", "");
headers.put(Exchange.HTTP_METHOD, "GET");
String body = "";
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-v1.0.0.getAcBal", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
@Test
public void testgetAcBal() {
  String requestName = "getAcBal";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("accountId", "");// THIS IS REQUIRED
headers.put("page_size", "");
headers.put("page_start", "");
headers.put("page_token", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put("disablePagination", "");
headers.put(Exchange.HTTP_METHOD, "GET");
String body = "";
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-v1.0.0.getAcBal", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
}
