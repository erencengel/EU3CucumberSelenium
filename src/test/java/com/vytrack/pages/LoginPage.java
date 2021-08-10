package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    //driver.findElement(By.id("prependedInput"));
    @FindBy(id="prependedInput")
    public WebElement usernameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id="_submit")
    public WebElement loginBtn;

    @FindBy(css=".btn.btn-primary")//how you are gonna keep multiple webelements inside a list
    public List<WebElement> buttons;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStoreManager(){
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsDriver(){
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();
    }

    public void loginAsSalesManager(){
        usernameInput.sendKeys(ConfigurationReader.get("salesmanager_username"));
        passwordInput.sendKeys(ConfigurationReader.get("salesmanager_password"));
        loginBtn.click();
    }

    public void loginAsWhatJamalWant(){
        usernameInput.sendKeys(ConfigurationReader.get("storemanager_username"));
        passwordInput.sendKeys(ConfigurationReader.get("storemanager_password"));
        loginBtn.click();
    }


}
