import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class QaCart_003_Extract {
    @Test
    public void Extract(){
        Response response = given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").
                when().get().
                then().extract().response();
        String Name = response.path("[0].country");
        System.out.println(Name);
    }
}
