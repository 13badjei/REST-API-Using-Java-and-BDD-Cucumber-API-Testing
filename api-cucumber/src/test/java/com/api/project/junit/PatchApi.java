package com.api.project.junit;

import com.api.project.model.FirstUser;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Benjamin Adjei on 24/11/20
 */
public class PatchApi {

    @Test
    public void putJsonPlaceholder(){

        FirstUser user = new FirstUser();
        user.setFirstName("Sherlock");
        user.setLastName("Holmes");

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .patch("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .log()
                .all();

    }
}

