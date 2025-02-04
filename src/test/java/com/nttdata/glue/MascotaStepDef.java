package com.nttdata.glue;

import com.nttdata.steps.MascotaStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.eclipse.jetty.websocket.api.StatusCode;


public class MascotaStepDef {
    MascotaStep mascota = new MascotaStep();


    @When("consulto la tienda de mascota con IDMASCOTA {int}")
    public void consultoLaTiendaDeMascotaConIDMASCOTA(int idMascota) {
        mascota.consulta(idMascota);
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int StatusCode ) {
        mascota.validarStatusCode(StatusCode);
    }

    @And("valido la respuesta sea {string}")
    public void validosLaRespuestaSea(String msg) {
        mascota.validoRespuesta (msg);
    }
}
