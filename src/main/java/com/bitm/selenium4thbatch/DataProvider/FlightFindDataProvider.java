package com.bitm.selenium4thbatch.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.selenium4thbatch.Utils.ExcelUtils;

public class FlightFindDataProvider {
	
	@DataProvider(name = "flightfinddataprovider")
	public static Object[][] getFlightFindData() {
		try {
			return new Object[][] { { ExcelUtils.getFlightFinderData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
