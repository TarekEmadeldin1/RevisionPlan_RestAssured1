import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class QaCArt_004_Headers {
    @Test
    public void Header() {
       Header name = new Header("name","Tarek");
       Header Country = new Header("country","Indonesia");
       Headers Info = new Headers(name ,Country);

        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").headers(Info).log().headers().
                when().get().
                then().log().all();
    }
}
