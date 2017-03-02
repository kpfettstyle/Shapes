/**
 * 
 */
package shapes_kpiper1;


/**
 * @author piper
 *
 */
public class Cylinder extends Shape {
	
	// Initialize radius and height of the Cylinder
	private float radius = 0.0f;
	private float height = 0.0f;
	
	// Get and Set Radius of Cylinder
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Get and Set Height of Cylinder

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	// Initialize a Cylinder object
	public Cylinder(Dialog dialog, float radiu, float height) {
		super(dialog);
		
		// Validate the Radius
		
		if (radius <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setRadius(radius);
		}
		
		// Validate the Height
		if(height <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setHeight(height);
		}
	}
	
	// Calculate Cylinder's Surface Area
	@Override
	public float surfaceArea() {
		// SA = (2pi * R * H) + (2pi * R^2)
		return (float) ((2 * Math.PI * getRadius() * getHeight())+(2 * Math.PI * Math.pow(getRadius(), 2)));

		
	}
	
	// Calculate the Cylinder's Volume
	@Override
	public float volume() {
		// V = pi * R^2 * H
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}
	
	public void render() {
		getDialog().show("Cylinder", "The Surface Area of the Cylinder is: " + this.surfaceArea() + "\n The volume of the Cylinder is: " + this.volume()); 
	}


}
