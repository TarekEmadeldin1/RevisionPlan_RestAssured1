import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class QaCart_002_Log {
    @Test
    public void LOG(){
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").log().method().log().parameters().
                when().get().
                then().log().ifValidationFails().body("[0].name",equalTo("Hope Hagenes")).log().ifStatusCodeIsEqualTo(200);
    }
}
