import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class QaCart_005_Hashmap {
    /*@Test
    public void Hash(){

        HashMap<String,String> Info = new HashMap<>();
        Info.put("name","Tarek");
        Info.put("name","Vincent Bode");
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/").queryParam("api/v1/users").
                headers(Info).log().all().
                when().get().
                then().log().all();
 }*/
    @Test
    public void HashmapQuery(){
        HashMap<String,String> Query = new HashMap<>();
        Query.put("country","Chile");
        Query.put("name","Hope Hagenes");
        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").queryParams(Query).
                when().get().
                then().log().all();
    }
}

