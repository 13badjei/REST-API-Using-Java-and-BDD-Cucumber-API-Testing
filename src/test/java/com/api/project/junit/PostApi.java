package com.api.project.junit;

import com.api.project.model.Address;
import com.api.project.model.FirstUser;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Benjamin Adjei on 14/12/2020
 *
 * {
 * "firstName": "Sherlock",
 * "lastName": "Holmes",
 * "address": {
 * "streetAddress": "Baker St.",
 * "phone": 123456789,
 * "email": "123@gmail.com"
 * }
 * }
 */
public class PostApi {


    @Test
    public void postJsonPlaceholder(){

        Address address = new Address();
        address.setStreetAddress("Baker St.");
        address.setPhone(123456789);
        address.setEmail("123@gmail.com");

        FirstUser user = new FirstUser();
        user.setFirstName("Sherlock");
        user.setLastName("Holmes");
        user.setAddressObject(address);



        given()
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .get("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(200)
                .log()
                .all();

    }
}
