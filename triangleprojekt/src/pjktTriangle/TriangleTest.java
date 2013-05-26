package pjktTriangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle t;
	private double kathetea = 10.1;
	private double katheteb = 5.01;
	private double alpha = 66.05;
	private double alpha1 = 45.0;
	private double kathetea1 = 3.0;
	private double katheteb1 = 4.0;
	private static final double DELTA = 1e-15; 
	

//@AfterClass
//  public static void tearDownAfterClass() throws Exception {
//		Triangle t = new Triangle();

//	}

	@Before
	public void setUp() throws Exception {
		Triangle t = new Triangle();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testFlaeche() {
		//fail("Not yet implemented");
	}

	@Test
	public void testHypotenuse() {
		fail("Not yet implemented");
	}

	@Test
	public void testWinkel() {
		fail("Not yet implemented");
	}

}
