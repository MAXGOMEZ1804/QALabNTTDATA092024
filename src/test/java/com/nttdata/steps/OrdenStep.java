package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class OrdenStep {
    private String URL_BASE = "https://petstore.swagger.io/v2/store/";

    public void consulta(int idOrden) {
        System.out.println("Consultar Orden");

        SerenityRest.given()
                .baseUri(URL_BASE)
                .relaxedHTTPSValidation()
                .log().all()
                .when()
                .get("order/" + String.valueOf(idOrden))
                .then()
                .log().all()
        ;
    }

    public void validarStatusCode(int statusCode) {
        Assert.assertEquals(statusCode, SerenityRest.lastResponse().getStatusCode());
    }

    public void validoRespuesta(String msg) {
        String respuesta = SerenityRest.lastResponse().getBody().path("message");
        Assert.assertEquals(msg, respuesta);
    }
}
