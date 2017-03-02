package shapes_kpiper1_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes_kpiper1.Cuboid;
import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;


public class CuboidUnitTests {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 2*((5*5) + (5*5) + (5*5));
		
		// 2. Act
		float actual = cuboid.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the values 5,5,5 should return a result of 1550", expected, actual, 0);
	
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.surfaceArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-5,-5,-5);
		
		cuboid.surfaceArea();
	}


	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5 * 5 * 5;
		
		// 2. Act
		float actual = cuboid.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the values 5,5,5 should return a result of 125", expected, actual, 0);
	
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.volume();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-5,-5,-5);
		
		cuboid.volume();
	}
	

	@Test
	public void testGetWidth() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getWidth();
		
		assertEquals("Getting the width of the newly created cuboid object should return a result of 5", expected, actual,0);	
	}
	

	@Test
	public void testGetHeight() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getHeight();
		
		assertEquals("Getting the height of the newly created cuboid object should return a result of 5", expected, actual,0);
	}


	@Test
	public void testGetDepth() {
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		float expected = 5;
		
		float actual = cuboid.getDepth();
		
		assertEquals("Getting the depth of the newly created cuboid object should return a result of 5", expected, actual, 0);
	}


	@Test
	public void testCuboidConstructorNormalValues() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(dialogSub,123,123,123);
		float expected = cuboid.getDepth();
		
		// 2. Act
		float actual = cuboid.getDepth();
	
		// 3. Assert
		assertEquals("A depth value inserted of 123 should return a result of 123 when called", expected, actual, 0);
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testCuboidConstructorNegativeValues() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,-123,-123,-123);
		
		cuboid.getDepth();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testCuboidConstructorZeroValues() throws IllegalArgumentException {
		Cuboid cuboid = new Cuboid(dialogSub,0,0,0);
		
		cuboid.getDepth();
	}
	

	// Verifies the cuboid render w orks
	@Test
	public void testCuboideRender(){
		Cuboid cuboid = new Cuboid(dialogSub,5,5,5);
		
		cuboid.render();
	}
}
