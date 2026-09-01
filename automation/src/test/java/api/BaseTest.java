package api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://dummyjson.com";
    }
}
