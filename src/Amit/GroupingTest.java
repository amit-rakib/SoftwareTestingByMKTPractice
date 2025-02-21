package Amit;

import org.testng.annotations.Test;

public class GroupingTest {
	
	
	@Test(groups= {"group1"})
	public void test1() {
		System.out.println("Smoky");
	}
	
	
	@Test (groups= {"group1", "group2"})
	public void test2() {
		System.out.println("Smoky, integration");
	}
	
	@Test
	public void test3() {
		System.out.println("Smoky, unit");
	}
	
	@Test
	public void test4() {
		System.out.println("Smoky");
	}

}
