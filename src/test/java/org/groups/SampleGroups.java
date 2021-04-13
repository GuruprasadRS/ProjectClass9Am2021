package org.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleGroups {
@Test(groups= {"smoke"})
private void TC0() {
	System.out.println("Method1");
}
@Test(groups= {"smoke","sanity"})
private void Tc1() {
	System.out.println("Method2");
	Assert.assertTrue(false);
}
@Test(groups= {"regression"},dependsOnGroups= {"smoke"},alwaysRun=true)
private void Tc2() {
	System.out.println("Method3");
}
@Test(groups= {"retest"},dependsOnGroups= {"smoke"},alwaysRun=true)
private void Tc3() {
	System.out.println("Method4");
}
@Test(groups= {"e2e"},dependsOnGroups= {"smoke"},alwaysRun=true)
private void Tc4() {
	System.out.println("Method5");
}
}
