package org.junit;

public class SampleBB {
	@Test
	public void tc11() {
		System.out.println("TC11");
	}
	@Ignore
	@Test
	public void tc22() {
		System.out.println("TC22");
	}
	@Test
	public void tc33() {
		System.out.println(4/0);
	}

}
