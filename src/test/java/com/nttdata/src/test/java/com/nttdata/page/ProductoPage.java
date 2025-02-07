package com.nttdata.page;

import org.openqa.selenium.By;

public class ProductoPage {


    public static By userInput = By.id("usuario");
    public static By passInput = By.id("clave");
    public static By loginButton = By.id("login-button");

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");

}
