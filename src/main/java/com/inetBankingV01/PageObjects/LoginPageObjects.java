package com.inetBankingV01.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects 
{

	
	WebDriver driver;
    public LoginPageObjects(WebDriver ldriver)
    {
        driver = ldriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name="uid")
    @CacheLookup
    WebElement txtUserID;

    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//input[@name='btnLogin']")
    @CacheLookup
    WebElement btnLogin;

    public void setTxtuserID(String userID)

    {
            
    	txtUserID.sendKeys(userID);
    }

    public void setTxtPassword(String password)
    {

            txtPassword.sendKeys(password);
    }

    public void clickloginBtn()
    {
    	btnLogin.click();
    }
	
	
}
