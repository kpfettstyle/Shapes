package shapes_kpiper1_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import shapes_kpiper1.Cuboid;


public class CuboitUnitTests {
	
	private float delta = 0.0001f;
	
	// surfaceArea - Verify calculates correct value
	
	@Test
	public void surfaceArea_Width1Height2Depth3_Returns22() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 2.0f * (1.0f * 2.0f + 2.0f * 3.0f + 3.0f * 1.0f);
		
		// 2. Act
		float actual = cuboid.surfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, delta);
	}
	
	// volume - verify calculates correct value
	
	@Test
	public void volume_Width1Height2Depth3_Returns6() {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(1.0f, 2.0f, 3.0f);
		float expected = 1.0f * 2.0f * 3.0f;
		
		// 2. Act
		float actual = cuboid.volume();
		
		// 3. Assert
		assertEquals(expected, actual, delta);

	}
}
