package org.parallelExecution;

import org.testng.annotations.Test;

public class sample3 {
	@Test
	private void tc000() {
		System.out.println("Method011");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc111() {
		System.out.println("Method112");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc222() {
		System.out.println("Method213");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc333() {
		System.out.println("Method314");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc444() {
		System.out.println("Method415");
		System.out.println(Thread.currentThread().getId());
	}

}
