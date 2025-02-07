package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductStoreSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class ProductStepsDef {

    private WebDriver driver;


    private ProductStoreSteps ProductStoreSteps(WebDriver driver){
        return new ProductStoreSteps(driver);
    }

    @Dado("estoy en la página de la tienda")
    public void estoy_en_la_página_de_la_tienda () {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store");
        screenShot();

    }
    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario (String usuario, String clave) {
        ProductStoreSteps loginSteps = new ProductStoreSteps(driver);
        loginSteps.typeUser(usuario);
        loginSteps.typePassword(clave);
        loginSteps.login();
        screenShot();
    }
    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navego_a_la_categoria(String categoria, String subcategoria) {
        ProductStoreSteps ProductStoreSteps = new ProductStoreSteps(driver);
        ProductStoreSteps.typeUser(categoria);
        ProductStoreSteps.typePassword(subcategoria);
        ProductStoreSteps.login();
        screenShot();
    }
    @Y("agrego 2 unidades del primer producto al carrito")
    public void agrego_2_unidades_del_primer_producto_al_carrito() {
        int itemsListSize = ProductStoreSteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmación_del_producto_agregado() {
        String title =  ProductStoreSteps(driver).getTitle();
        //prueba: validamos el título del producto

    }
    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {
        int itemsListSize = ProductStoreSteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Cuando("finalizo la compra")
    public void finalizo_la_compra() {
        ProductStoreSteps ProductStoreSteps = new ProductStoreSteps(driver);

        screenShot();
    }
    @Entonces("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito() {

    }
    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito() {
        int itemsListSize = ProductStoreSteps(driver).getItemSize();
        //prueba: validar que al menos exista un item
        screenShot();
        Assertions.assertTrue(itemsListSize > 0, "El tamaño de la lista es: " + itemsListSize);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
