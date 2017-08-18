package com.bitm.selenium4thbatch.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.internal.Executable;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.DTO.LoginDTO;
import com.bitm.selenium4thbatch.DataProvider.LoginDataProvider;
import com.bitm.selenium4thbatch.Utils.Drivermanager;
import com.bitm.selenium4thbatch.Utils.UrlTextUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class LoginTest {
	
	
	private WebDriver driver = null;
	
	@Test(priority = 1)
	public void checkHomePageTitle() throws InterruptedException {
		//driver = ExecuteDriver.driver;
		driver = Drivermanager.driver;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		
        System.out.println("Home Page Title Verified !!!");	

	}
	
	@Test(priority = 2,dataProvider="logindataprovider",dataProviderClass=LoginDataProvider.class)
	public void loginTest(List<LoginDTO>logins) throws InterruptedException{
		
		for(LoginDTO loginexcel:logins){
			
			//driver.get(UrlTextUtils.BASE_URL);
			driver.findElement(By.xpath(XpathUtils.Login.Login_User_Name)).sendKeys(loginexcel.getUsername());
			driver.findElement(By.xpath(XpathUtils.Login.Login_Password)).sendKeys(loginexcel.getPassword());
			driver.findElement(By.xpath(XpathUtils.Login.Login_BTN)).click();
			
	        System.out.println("Login Test Successful !!!");
		}
		
	}

}
