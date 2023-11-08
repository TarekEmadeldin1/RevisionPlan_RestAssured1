import Pojjoo.Constructtt;
import Pojjoo.Pojoo;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Qa_Cart_008_PojoClass {
    @Test
    public void Pojjooo(){
        Pojoo pojoo=new Pojoo();
        pojoo.setEmail("jsnvskjnk@hotmail.com");
        pojoo.setPassword("bvcxjnrvf");
        Constructtt constructtt = new Constructtt("Tavjshkb@gamil.com","dhbdkbkk");

        given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").contentType(ContentType.JSON).body(constructtt).
                when().post().then().log().all();
    }
}
