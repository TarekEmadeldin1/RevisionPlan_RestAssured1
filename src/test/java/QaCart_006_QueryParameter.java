import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class QaCart_006_QueryParameter {
    @Test
    public void QueryParam(){
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/").
                queryParams("name","Hope Hagenes").
                when().get("api/v1/users").
                prettyPrint();
    }
}
