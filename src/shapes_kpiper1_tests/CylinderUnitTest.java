package shapes_kpiper1_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import shapes_kpiper1.Cylinder;

public class CylinderUnitTest {
	
	private float delta = 0.0001f;
	
	// surfaceArea - Verify calculates correct value

	@Test
	public void surfaceAreaHeight1Radius2_Returns37() {
		
		// 1. Arrange
		Cylinder cylinder = new Cylinder(1.0f, 2.0f);
		float expected = (float) ((2*Math.PI * 2.0f * 1.0f) + (2*Math.PI * Math.pow(2.0f, 2)));
		
		// 2. Act
		float actual = cylinder.surfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, delta);
	}
	
	// volume - verify calculates correct value
	
	@Test
	public void volume_Height1Radius2_Return12() {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(1.0f, 2.0f);
		float expected = (float) (Math.PI * Math.pow(2.0f, 2) * 1.0f);
		
		// 2. Act
		float actual = cylinder.volume();
		
		// 3. Assert
		assertEquals(expected, actual, delta);

	}
}
