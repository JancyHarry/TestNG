package org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test3 {
	@Parameters({"username","password"})
	@Test
	private void test01(String s,String s1) {
		System.out.println("Test 01");

	}
	


}
