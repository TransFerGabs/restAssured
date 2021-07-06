package br.com.lab.automacao.api.tests;

import br.com.lab.automacao.api.constants.BaseClass;
import br.com.lab.automacao.api.constants.Constants;
import br.com.lab.automacao.api.cucumber.TestContext;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsString;

public class APITest extends BaseClass {

    @Test
    public void retornoPorCidade(){

        TestContext testContext = new TestContext();
       // testContext.cidadeBase("Itapira");

        given()
                .relaxedHTTPSValidation()
                .queryParam("appid", Constants.idAPI)
                .queryParam("q", "Cascavel,sc,br")
                .baseUri(Constants.URI)
                .log().uri()
                .when()
                .post()
                .then()
                .log().body()
                .statusCode(200)
                .body(is(not(nullValue())))
                .body(containsString("Itapira"));
    }
}
