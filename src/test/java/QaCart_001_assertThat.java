import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class QaCart_001_assertThat {
@Test
    public void AssertThat(){
    given().baseUri("https://6489b0585fa58521cab00f99.mockapi.io/api/v1/users").
            when().get().
            then().log().all()
            .statusCode(200).
            assertThat().body("[0].name",equalTo("Hope Hagenes")).
            assertThat().body("[0]",hasKey("name")).
            assertThat().body("id",hasSize(11)).
            assertThat().body("[1]",hasEntry("name","Miss Jonathon Bauch")).
            assertThat().body("createdAt",everyItem(startsWith("2023"))).
            assertThat().body("name",not(hasItem("Khaled"))).
            assertThat().body("[1].name",equalTo("Miss Jonathon Bauch"),"name",hasItems("Miss Jonathon Bauch","Hope Hagenes")).
            assertThat().body("[1]",hasValue("Chile"));
}
}
