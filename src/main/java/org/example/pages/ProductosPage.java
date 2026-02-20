package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductosPage extends BasePage{
    private WebDriver driver;

    //elementos -> PAGE FACTORY
    @FindBy(xpath = "(//span[contains(text(),'Elegí')])[2]")
    private WebElement comboBoxElegirTalle;
    @FindBy(xpath = "//li[@class='andes-list__item andes-list__item--size-medium']")
    private WebElement talle;

    //constructor de este objeto
    public ProductosPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //acciones
    public void elegirTalle(){
        click(comboBoxElegirTalle);
        click(talle);
    }
}
