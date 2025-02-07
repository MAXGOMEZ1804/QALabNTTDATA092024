package com.nttdata.glue;

import com.nttdata.steps.CrearOrdenStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearOrdenStepDef {
    @Steps
    CrearOrdenStep crearOrden;

    @When("creo el orden con id {string}, petId {string}")
    public void crearOrden(String id, String petId){
        crearOrden.crearOrden(id, petId);
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
        crearOrden.validarCodigoRespuesta(statusCode);
    }

    @And("el type es {string}")
    public void elTypeEs(String type) {
        crearOrden.validarType(type);
    }
}
