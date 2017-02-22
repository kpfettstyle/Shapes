/**
 * 
 */
package shapes_kpiper1;


/**
 * @author piper
 *
 */
public class Cuboid extends Shape {
	
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	public Cuboid(Dialog dialog) {
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
