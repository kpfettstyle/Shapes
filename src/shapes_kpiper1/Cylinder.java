/**
 * 
 */
package shapes_kpiper1;

/**
 * @author piper
 *
 */
public class Cylinder extends Shape {
	
	// Establish Cylindeer's radius and height
	private  float cylinderRadius;
	private float cylinderHeight;
	
	public Cylinder() {
		this(0, 0);
	}
	
	public Cylinder(float cylinderRadius, float cylinderHeight) {
		this.cylinderRadius = cylinderRadius;
		this.cylinderHeight = cylinderHeight;
		
	}
	
	
	// Calculate Cylinder's Surface Area and Volume
	@Override
	public float surfaceArea() {
		// SA = (2pi * R * H) + (2pi * R^2)
		return (float) ((2 * Math.PI * cylinderRadius * cylinderHeight)+(2 * Math.PI * Math.pow(cylinderRadius, 2)));
		
	}
	
	@Override
	public float volume() {
		// V = pi * R^2 * H
		return (float) (Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight);
	}
	
	
	
}
