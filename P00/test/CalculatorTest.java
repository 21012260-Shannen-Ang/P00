import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * USER, 26 May 2022 2:51:32 pm
 */

/**
 * @author USER
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddNormal() {           //Normal Case//
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertEquals (expected,actual);
	}
	
	@Test
	public void testAddBoundary() {          //Boundary Case//
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = 9999;
			assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testAddError() { //Error Case//
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.add(a, b);
			
			int expected = -1000;
			assertEquals (expected,actual);	
	}
	
	@Test
	public void testSubstractNormal() {        //Normal Case//
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
			Calculator cal = new Calculator();
			int actual = cal.substract(a, b);
			
			int expected = 5555;
			assertEquals (actual,expected);
	}
	
	@Test
	public void testSubstractBoundary() {        //Boundary Case//
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
			Calculator cal = new Calculator();
			int actual = cal.substract(a, b);
			
			int expected = 5555;
			assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testSubstractError() { //Error Case//
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.substract(a, b);
			
			int expected = -1000;
			assertEquals (expected,actual);	
	}
	@Test
	public void testMultipleNormal() {     //Normal Case//
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultipleBoundary() {        //Boundary Case//
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b);
			
			int expected = 5332114;
			assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}

	@Test
	public void testMultipleError() { //Error Case//
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.multiple(a, b);
			
			int expected = -1000;
			assertEquals (expected,actual);	
	}
	
	@Test
	public void testDivideNormal() {   //Normal Case//
		//fail("Not yet implemented");
		int a = 10;
		int b = 2;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
			 
		int expected = 5;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivideBoundary() {        //Boundary Case//
		//fail("Not yet implemented");
		int a = 10;
		int b = 2;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			int expected = 5;
			assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testDivideError() { //Error Case//
		//fail("Not yet implemented");
		int a = 9999;
		int b = 0;
		
			Calculator cal = new Calculator();
			int actual = cal.divide(a, b);
			
			int expected = -1000;
			assertEquals (expected,actual);	
	}
}


