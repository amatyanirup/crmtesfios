package TestNgListener;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenShotTest extends Base {
	@BeforeMethod
	public void setup() {
	
	initialization();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
@Test
public void takeScreenshotTest() {
	Assert.assertEquals(false, true);
}
@Test
public void logintest() {
	Assert.assertEquals(false, true);
}@Test
public void verificationSearch() {
	Assert.assertEquals(false, true);
}@Test
public void test1 () {
	Assert.assertEquals(false, true);
}@Test
public void test2() {
	Assert.assertEquals(false, true);
}@Test
public void test3() {
	Assert.assertEquals(false, true);
}
}
