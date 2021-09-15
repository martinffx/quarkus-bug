package org.my.group;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class MyResourceTest {

  @Test
  public void testHelloEndpoint() {
    var test = this.getClass().getResource("/test.txt");
    assert (test != null);
    given().when().get("/hello").then().statusCode(200).body(
        is("Hello RESTEasy"));
  }
}
