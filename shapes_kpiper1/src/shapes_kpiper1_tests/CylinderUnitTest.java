package shapes_kpiper1_tests;


import static org.junit.Assert.*;

import org.junit.Test;

import shapes_kpiper1.Cylinder;
import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;

public class CylinderUnitTest {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = (float) (2 * (Math.PI * (5 * 5)) + (2 * Math.PI * 5) * 5);
		
		// 2. Act
		float actual = cylinder.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the values 5 and 5 should return a result of 314.16", expected, actual, 0);
	
	}
	

	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.surfaceArea();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.surfaceArea();
	}


	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = (float) (Math.PI * (5 * 5) * 5);
		
		// 2. Act
		float actual = cylinder.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the values 5 and 5 should return a result of 392.86", expected, actual,0);
	
	}
	

	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.volume();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.volume();
	}


	@Test
	public void testGetRadius() {
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		float expected = 5;
		
		float actual = cylinder.getRadius();
		
		assertEquals("Getting the radius of the newly created cylinder object should return a result of 5", expected, actual, 0);	
	}


	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		float expected = 5;
		
		float actual = cylinder.getHeight();
		
		assertEquals("Getting the height of the newly created cylinder object should return a result of 5", expected, actual, 0);	
	}


	@Test
	public void testCylinderConstructorNormalValues() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(dialogSub,5, 5);
		float expected = 5;
		
		// 2. Act
		float actual = cylinder.getHeight();
	
		// 3. Assert
		assertEquals("A constructor of the cylinder class given the values of (5,5) should return a height of 5", expected, actual, 0);
	
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testCylinderConstructorZeroException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,0,0);
		
		cylinder.getHeight();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testCylinderConstructorNegativeException() throws IllegalArgumentException {
		Cylinder cylinder = new Cylinder(dialogSub,-5,-5);
		
		cylinder.surfaceArea();
	}
	

	// Verifies that the Cylinder render works.
	@Test
	public void testCylinderRender(){
		Cylinder cylinder = new Cylinder(dialogSub,5,5);
		
		cylinder.render();
	}


}
