package com.mps.urlshortener.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class UrlShortenerResourceTest {

    @Test
    public void testShortenUrlEndpoint() {
        final String url = "github.com/milenaps";
        given()
            .when().get("/v1/shortenurl/{url}", url)
            .then()
            .statusCode(200)
            .body(is(url));
    }
}