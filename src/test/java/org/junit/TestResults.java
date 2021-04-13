package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResults {
public static void main(String[] args) {
	Result runClasses = JUnitCore.runClasses(SampleA.class,SampleBB.class);
	int failureCount = runClasses.getFailureCount();
	System.out.println("Failure Count:"+failureCount);
	int ignoreCount = runClasses.getIgnoreCount();
	System.out.println("Ignore Count:"+ignoreCount);
	int runCount = runClasses.getRunCount();
	System.out.println(runCount);
	long runTime = runClasses.getRunTime();
	System.out.println(runTime);
	List<Failure> failures = runClasses.getFailures();
	for (Failure failure : failures) {
		System.out.println("Failure:"+failure);
	}
}
}
