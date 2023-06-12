package restAssured;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class HTTPRequests {
    @Test
    void getUsers(){
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
        .then()
                .statusCode(200)
                .body("page",equalTo(2))
                .log().all();
    }
/*
    @Test
    void createUser(){
        HashMap data = new HashMap();
        data.put("name","alejandro");
        data.put("job","student");
        given()
                .contentType("application/json")
                .body(data)
                .when()
                    .post("https://reqres.in/api/users")
                .then()
                    .statusCode(201)
                    .log().all();
    }*/
}
