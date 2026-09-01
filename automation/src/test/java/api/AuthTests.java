package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class AuthTests extends BaseTest {

    @Test
    void shouldLoginWithValidCredentials() {

        given()
                .contentType("application/json")
                .body("""
                        {
                          "username": "emilys",
                          "password": "emilyspass"
                        }
                        """)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .body("accessToken", not(emptyOrNullString()))
                .body("username", equalTo("emilys"));
    }

    @Test
    void shouldRejectInvalidCredentials() {

        given()
                .contentType("application/json")
                .body("""
                        {
                          "username": "emilys",
                          "password": "wrong-password"
                        }
                        """)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(400);
    }
}
