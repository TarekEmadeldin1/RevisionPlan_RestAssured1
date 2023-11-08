import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class QaCart_007_SendBody {
   /* @Test
    public void SendBodyAsFile(){
        File body = new File("src/test/resources/Body.json");
        given().baseUri("https://reqres.in/api/users").
                headers("Content-Type","application/json").body(body).
                when().post().
                then().log().all();
    }*/
   /* @Test
    public void SendBodyAsString(){
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}";
        given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(body).
                when().post().
                then().log().all();
    }*/
    @Test
    public void SendBodyAsHashmap(){
        HashMap<String,String> body = new HashMap<>();
        body.put("name","morpheus");
        body.put("job","leader");

        given().baseUri("https://reqres.in/api/users").contentType(ContentType.JSON).body(body).
                when().post().
                then().log().all();
    }
}
