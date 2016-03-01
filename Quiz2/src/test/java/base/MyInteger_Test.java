package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	@Test
	public void testisEven() {
		int iIntegerTestValue = 8;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedresult = true;
		boolean bActualResult = instance.isEven();
		assertEquals("testisEven() failed", bExpectedresult,bActualResult);
	}
		@Test
		public void testisOdd() {
			int iIntegerTestValue = 9;
			MyInteger instance = new MyInteger(iIntegerTestValue);
			boolean bExpectedresult = true;
			boolean bActualResult = instance.isOdd();
			assertEquals("testisEven() failed", bExpectedresult,bActualResult);
	}
		@Test
		public void testisPrime() {
			int iIntegerTestValue = 17;
			MyInteger instance = new MyInteger(iIntegerTestValue);
			boolean bExpectedresult = true;
			boolean bActualResult = instance.isPrime();
			assertEquals("testisEven() failed", bExpectedresult,bActualResult);

}
		@Test
		public void testequals() {
			int iIntegerTestValue = 8;
			MyInteger instance = new MyInteger(iIntegerTestValue);
			boolean bExpectedresult = true;
			boolean bActualResult = instance.equals(8);
			assertEquals("testisEven() failed", bExpectedresult,bActualResult);
}
}
