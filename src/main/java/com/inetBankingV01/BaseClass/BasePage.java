package com.inetBankingV01.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BasePage 
{
	public WebDriver driver;
	
	@BeforeClass
    public void initialization()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\inetBankingV01\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/");
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    }
	
	
}
