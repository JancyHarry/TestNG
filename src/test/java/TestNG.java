
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeSuite
	private void beforeSuite() {
		System.out.println("Before Suite");

	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");

	}

	@Test
	private void test01() {
		System.out.println("Test 01");

	}

	@Test
	private void test02() {
		System.out.println("Test 01");

	}

	@Test
	private void test03() {
		System.out.println("Test 01");

	}

	@Test
	private void test04() {
		System.out.println("Test 01");

	}

	@Test
	private void test05() {
		System.out.println("Test 01");

	}
	@Test
	private void test06() {
		System.out.println("Test 01");
	}
	@Test
	private void test07() {
		System.out.println("Test 01");

	}
	@Test
	private void test08() {

		System.out.println("Test 01");

	}
	@Test
	private void test09() {
		System.out.println("Test 01");

	}
	@Test
	private void test010() {
		System.out.println("Test 01");

	}

	@Test

	private void test011() {

	}

	@Test

	private void test012() {
	}

	@Test

	private void test013() {
	}

	@Test

	private void test014() {
	}

	@Test

	private void test015() {
	}

	@AfterSuite
	private void afterSuite() {
		System.out.println("After Suite");

	}

	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");

	}
}
