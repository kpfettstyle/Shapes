/**
 * 
 */
package shapes_kpiper1;

/**
 * @author piper
 *
 */
public class Sphere extends Shape{
	
	
	private float radius = 0.0f;
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float width) {
		this.radius = radius;
	}

	public Sphere(Dialog dialog) {
		super(dialog);
	}
	
	public float surfaceArea() {
		return -1.0f;
	}
	
	public float volume() {
		return -1.0f;
	}
	
	public void render() {
		getDialog().show("Ima Message Box", "Yay messages!");
	}

}
