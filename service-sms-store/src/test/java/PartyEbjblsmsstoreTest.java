import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.junit.Test;

import org.junit.BeforeClass;
import com.temenos.irf.testsupport.*;


public class PartyEbjblsmsstoreTest extends CamelRouteTest
{

 private static CamelUnitTestHelper helper;
@BeforeClass
public static void init() {
   helper = new CamelUnitTestHelper("party-ebjblsmsstore.service.v1.0.0", "./src/test/resources/test-data/");
}
@Test
public void testcreateSms() {
  String requestName = "createSms";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("id", "");// THIS IS REQUIRED
headers.put("validate_only", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put(Exchange.HTTP_METHOD, "POST");
String body = ""; // THIS IS REQUIRED
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-ebjblsmsstore.createSms", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
@Test
public void testcreateSms() {
  String requestName = "createSms";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("id", "");// THIS IS REQUIRED
headers.put("validate_only", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put(Exchange.HTTP_METHOD, "POST");
String body = ""; // THIS IS REQUIRED
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-ebjblsmsstore.createSms", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
@Test
public void testcreateSms() {
  String requestName = "createSms";
helper.getTestSupportConnectionFactory().setRequestName(requestName);
helper.getTestSupportConnectionFactory().setRecording(true);
Map<String, Object> headers = new HashMap<>();
headers.put("id", "");// THIS IS REQUIRED
headers.put("validate_only", "");
headers.put("credentials", "");
headers.put("companyId", "");
headers.put("deviceId", "");
headers.put("userRole", "");
headers.put(Exchange.HTTP_METHOD, "POST");
String body = ""; // THIS IS REQUIRED
Object result = helper.getProducerTemplate().requestBodyAndHeaders("direct-vm:party-ebjblsmsstore.createSms", body, headers);
 Map<String, List<String>> testResults = helper.checkResponse(requestName, result);
super.checkPaths(testResults);
}
}
