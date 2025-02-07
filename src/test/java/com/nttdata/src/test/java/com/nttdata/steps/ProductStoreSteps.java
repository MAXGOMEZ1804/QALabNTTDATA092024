package com.nttdata.steps;

import com.nttdata.page.ProductoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductStoreSteps {

    private WebDriver driver;

    //constructor
    public ProductStoreSteps(WebDriver driver){
        this.driver = driver;
    }


    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(ProductoPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductoPage.loginButton));
    }

    public void typePassword(String password){
        this.driver.findElement(ProductoPage.passInput).sendKeys(password);
    }


    public void login(){
        this.driver.findElement(ProductoPage.loginButton).click();
    }


    public String getTitle(){
        return this.driver.findElement(ProductoPage.productsTitle).getText();
    }


    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(ProductoPage.itemsCards);
        return items.size();
    }
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getTitle(){
        return this.driver.findElement(ProductoPage.productsTitle).getText();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(ProductoPage.itemsCards);
        return items.size();
    }
}
