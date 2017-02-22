/**
 * 
 */
package shapes_kpiper1;


/**
 * @author piper
 *
 */
public class Cylinder extends Shape {
	
	private float radius = 0.0f;
	private float height = 0.0f;
	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float width) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public Cylinder(Dialog dialog) {
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
