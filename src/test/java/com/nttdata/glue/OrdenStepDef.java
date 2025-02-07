package com.nttdata.glue;

import com.nttdata.steps.OrdenStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class OrdenStepDef {
    OrdenStep orden = new OrdenStep();


    @When("consulto la orden con IDORDEN {int}")
    public void consultoLaTiendaDeMascotaConIDMASCOTA(int idOrden) {
        orden.consulta(idOrden);
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int StatusCode ) {
        orden.validarStatusCode(StatusCode);
    }

    @And("valido la respuesta sea {string}")
    public void validosLaRespuestaSea(String msg) {
        orden.validoRespuesta (msg);
    }
}
