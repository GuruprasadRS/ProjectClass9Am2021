package org.rerun;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AutomationRerunClass {
	@Test
	private void tc1() {
		System.out.println("Method1");
	}
	@Test
	private void tc2() {
		System.out.println("Method2");
	}
	@Test
	private void tc3() {
		System.out.println("Method3");
	}
	@Test
	private void tc4() {
		System.out.println("Method4");
		Assert.assertTrue(false);
	}
	@Test
	private void tc5() {
		System.out.println("Method5");
	}
}
