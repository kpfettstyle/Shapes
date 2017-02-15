package shapes_kpiper1_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import shapes_kpiper1.Sphere;

public class SphereUnitTest {
	private float delta = 0.0001f;
	
	// surfaceArea - Verify calculates correct value
	@Test
	public void surfaceAreaRadius2_Return50() {
		// 1. Arrange
		Sphere sphere = new Sphere(2.0f);
		float expected = (float) (4 * Math.PI * Math.pow(2.0f, 2));;
		
		// 2. Act
		float actual = sphere.surfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, delta);
	}
	
	// volume - verify calculates correct value
	@Test
	public void volumeRadius2_Return33() {
		// 1. Arrange
		Sphere sphere = new Sphere(2.0f);
		float expected = (float) ((4 / 3) * Math.PI * Math.pow(2.0f, 3));
		
		// 2. Act
		float actual = sphere.volume();
		
		// 3. Assert
		assertEquals(expected, actual, delta);
	}
}
