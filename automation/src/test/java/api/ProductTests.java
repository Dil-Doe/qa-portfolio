package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class ProductTests {

    @Test
    void shouldGetProductById() {
        RestAssured.baseURI = "https://dummyjson.com";

        given()
                .when()
                .get("/products/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", not(emptyOrNullString()))
                .body("price", greaterThan(0));
    }

    @Test
    void shouldReturnNotFoundForInvalidProduct() {
        RestAssured.baseURI = "https://dummyjson.com";

        given()
                .when()
                .get("/products/999999")
                .then()
                .statusCode(404);
    }
}
