package APITest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class apitestexample {
    // @Test
    public void testAPI() {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());
        System.out.println(response.getHeader("content-type"));

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }

    // @Test
    public void testAPIGet() {
        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().statusCode(200).
                body("data[4].first_name", equalTo("George")).
                log().all();
        given().
                get("/users?page=2").
                then().statusCode(200).
                body("data[4].first_name", equalTo("George")).
                body("data.first_name", hasItems("Rachel", "Tobias"));
    }

    //@Test
    public void testAPIPost() {
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("name", "morpheus");
//        map.put("job", "leader");
//        System.out.println(map);
        JSONObject request = new JSONObject(map);
        request.put("name", "morpheus");
        request.put("job", "leader");
        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in/api";
        given().
                header("Content-Type", "application/json").
                body(request.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).log().all();
    }

    @Test
    public void testAPIPutPatchDelete() {
        Map<String, Object> map = new HashMap<String, Object>();
        JSONObject request = new JSONObject(map);
        request.put("name", "morpheus");
        request.put("job", "zion resident");
        System.out.println(request.toJSONString());
        baseURI = "https://reqres.in/api";
        System.out.println("************");
        given().
                header("Content-Type", "application/json").
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200).log().all();
        System.out.println("************");
        given().
                header("Content-Type", "application/json").
                body(request.toJSONString()).
                when().
                patch("/users/2").
                then().
                statusCode(200).log().all();
        System.out.println("************");
        when().
                delete("/users/2").
                then().
                statusCode(204).log().all();
        System.out.println("************");
    }
}
