package org.hexa;

import org.testng.annotations.DataProvider;

public class ClassProgram2 {
	@DataProvider(name = "Data")
	public static Object[][] loginData() {
		return new Object[][] { { "chennai", "Coimbatore" }, { "Chennai", "Bangalore" }, { "Chennai", "Karur" } };
	}

}
