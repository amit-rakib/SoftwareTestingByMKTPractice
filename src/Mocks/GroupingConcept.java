package Mocks;

import org.testng.annotations.Test;

public class GroupingConcept {
	
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("Smoke");
	}
	
	@Test(groups= {"smoke", "sanity"})
	public void test2() {
		System.out.println("Smoke, Sanity");

	}
	
	@Test(groups= {"sanity", "regression"})
	public void test3() {
		System.out.println("Sanity, Regression");

	}
	
	@Test(groups= {"smoke", "unity"})
	public void test4() {
		System.out.println("Smoke, Unity");

	}

}
