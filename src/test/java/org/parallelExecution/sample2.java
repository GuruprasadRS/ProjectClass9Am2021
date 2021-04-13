package org.parallelExecution;

import org.testng.annotations.Test;

public class sample2 {
	@Test
	private void tc00() {
		System.out.println("Method01");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
		System.out.println("Method12");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
		System.out.println("Method23");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
		System.out.println("Method34");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc44() {
		System.out.println("Method45");
		System.out.println(Thread.currentThread().getId());
	}

}
