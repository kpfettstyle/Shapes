package shapes_kpiper1_tests;


import static org.junit.Assert.*;

import org.junit.Test;

import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;
import shapes_kpiper1.Sphere;

public class SphereUnitTest {
	
	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	@Test
	public void testSurfaceAreaNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(dialogSub,5);
		float expected = (float) (float) (4 * Math.PI * (5 * 5));
		
		// 2. Act
		float actual = sphere.surfaceArea();
	
		// 3. Assert
		assertEquals("A surface area calculation given the value of 5 should return a result of 314.16", expected, actual,0);
	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,0);
		
		sphere.surfaceArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSurfaceAreaNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,-5);
		
		sphere.surfaceArea();
	}
	
	@Test
	public void testVolumeNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(dialogSub,5);
		float expected = (float) ((4.0/3.0) * Math.PI * Math.pow(5, 3));
		
		// 2. Act
		float actual = sphere.volume();
	
		// 3. Assert
		assertEquals("A volume calculation given the value of 5 should return a result of 523.6", expected, actual,0);
	
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testVolumeZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,0);
		
		sphere.volume();
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testVolumeNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,-5);
		
		sphere.volume();
	}


	@Test
	public void testGetRadius() {
		Sphere sphere = new Sphere(dialogSub,5);
		float expected = 5;
		
		float actual = sphere.getRadius();
		
		assertEquals("Getting the radius of the newly created sphere object should return a result of 5", expected, actual, 0);	
	}


	@Test
	public void testSphereConstructorNormalValues() {
		// 1. Arrange
		Sphere sphere = new Sphere(dialogSub,5);
		float expected = 5;
		
		// 2. Act
		float actual = sphere.getRadius();
	
		// 3. Assert
		assertEquals("A constructor given the value of 5 for the radius should return a value of 5", expected, actual,0);
	
	}
	

	
	@Test(expected = IllegalArgumentException.class)
	public void testSphereConstructorZeroException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,0);
		
		sphere.getRadius();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSphereConstructorNegativeException() throws IllegalArgumentException {
		Sphere sphere = new Sphere(dialogSub,-5);
		
		sphere.getRadius();
	}
	
	
	// Verifies the Sphere render
	@Test
	public void testSphereRender(){
		Sphere sphere = new Sphere(dialogSub,5);
		
		sphere.render();
	}
	
}
