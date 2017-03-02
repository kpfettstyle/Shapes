/**
 * 
 */
package shapes_kpiper1;

/**
 * @author piper
 *
 */
public class Sphere extends Shape{
	
	// Initialize the Sphere dimensions
	
	private float radius = 0.0f;
	
	// Get and Set Radius for the Sphere
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Sphere(Dialog dialog, float radius) {
		super(dialog);
		
		// Validate the dimensions are not 0
		if (radius <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setRadius(radius);
		}
	}
	
	// Calculate the Surface Area for the Sphere
	@Override
	public float surfaceArea() {
		
		return (float) (4 * Math.PI * (getRadius() * getRadius()));
	}

	// Calculate the Volume of the Sphere
	@Override
	public float volume() {
		return (float) ((4.0/3.0) * Math.PI * Math.pow(getRadius(), 3));
	}
	
	public void render() {
		getDialog().show("Sphere", "The Surface Area of the Sphere is: " + this.surfaceArea() + "\n The Volume of the Sphere is: " + this.volume());
	}
}
