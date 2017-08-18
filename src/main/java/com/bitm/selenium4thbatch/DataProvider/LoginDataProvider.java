package com.bitm.selenium4thbatch.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.selenium4thbatch.Utils.ExcelUtils;

public class LoginDataProvider {

	@DataProvider(name = "logindataprovider")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcelUtils.getLoginData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
