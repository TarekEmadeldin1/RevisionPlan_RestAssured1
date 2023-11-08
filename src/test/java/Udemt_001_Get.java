import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Udemt_001_Get {
    @Test
    public void HttpProtocolsMethods() {
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users/1").
                when().get().prettyPrint();
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users/2").header("Content-type","application/json").
                body("{\n" + " \"name\":\"Tarek\",\n  " + " \"country\":\"Egypt\"\n " + "}").
                when().put().prettyPrint();
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").
                header("Content-type","application/json").body(" {\n " + " \"name\":\"Teka\",\n  " + " \"country\":\"Turkey\"\n " + "}").
                when().post().prettyPrint();
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users/2").
                when().delete().prettyPrint();
    }


}
