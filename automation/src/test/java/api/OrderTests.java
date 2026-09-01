package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class OrderTests extends BaseTest {

    @Test
    void shouldCreateCart() {
        given()
                .contentType("application/json")
                .body("""
                        {
                          "userId": 1,
                          "products": [
                            {
                              "id": 1,
                              "quantity": 2
                            }
                          ]
                        }
                        """)
                .when()
                .post("/carts/add")
                .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("userId", equalTo(1))
                .body("products[0].id", equalTo(1))
                .body("products[0].quantity", equalTo(2));
    }

    @Test
    void shouldReturnErrorForInvalidProduct() {
        given()
                .contentType("application/json")
                .body("""
                        {
                          "userId": 1,
                          "products": [
                            {
                              "id": 999999,
                              "quantity": 1
                            }
                          ]
                        }
                        """)
                .when()
                .post("/carts/add")
                .then()
                .statusCode(404);
    }
}
