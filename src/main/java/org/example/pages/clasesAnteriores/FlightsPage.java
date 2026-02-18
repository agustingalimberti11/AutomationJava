package org.example.pages.clasesAnteriores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {
    private WebDriver driver;

    //elementos -> PAGE FACTORY
    @FindBy(name = "findFlights")
    private WebElement btnContinuar;


    //constructor de este objeto
    public FlightsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //acciones
    public void clickContinuar(){
        btnContinuar.click();
    }
}
