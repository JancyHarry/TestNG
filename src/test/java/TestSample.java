import org.testng.annotations.Test;

public class TestSample {
	
	@Test(priority=-1)
	private void test01() {
		System.out.println(" Test 01");

	}
	@Test(priority=1)
	private void test02() {
		System.out.println(" Test 02");

	}
	@Test(priority=-10)
	private void test03() {
		System.out.println(" Test 03");

	}
	@Test(priority=6)
	private void test04() {
		System.out.println(" Test 04");

	}
	@Test(priority=4)
	private void test5() {
		System.out.println(" Test 05");

	}
	@Test(priority=-6)
	private void test06() {
		System.out.println(" Test 06");

	}

}
