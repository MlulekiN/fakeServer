import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

public class restApi {
    @Test
    public void getSomething(){

        baseURI = "https://my-json-server.typicode.com/MlulekiN/fakeServer";
        given().get("/users").then().statusCode(200).log().all();
    }

    @Test
    public void postSomething(){

        JSONObject request = new JSONObject();

        request.put("name", "Lebo-Mathosa");
        request.put("title", "I Love Music");
        request.put("song-id", "1");
        request.put("genre-id", "3");

        baseURI = "https://my-json-server.typicode.com/MlulekiN/fakeServer";

        given().contentType(ContentType.JSON).
                accept(ContentType.JSON).header("ContentType","application/json" ).
                when().post("/users").then().statusCode(201).
                log().all();


    }
}
