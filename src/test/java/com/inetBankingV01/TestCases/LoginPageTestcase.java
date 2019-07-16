package com.inetBankingV01.TestCases;

import org.testng.annotations.Test;

import com.inetBankingV01.BaseClass.BasePage;
import com.inetBankingV01.PageObjects.LoginPageObjects;

public class LoginPageTestcase extends BasePage
{
	
	 public LoginPageObjects loginPageObj;

	    @Test
	    public void loginPage()
	    {
	        loginPageObj = new LoginPageObjects(driver);
	        loginPageObj.setTxtuserID("mngr208997");
	        loginPageObj.setTxtPassword("desAsUm");
	        loginPageObj.clickloginBtn();
	        
		
	}

}
