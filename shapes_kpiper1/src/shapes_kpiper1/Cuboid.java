/**
 * 
 */
package shapes_kpiper1;


/**
 * @author piper
 *
 */
public class Cuboid extends Shape {
	
	// Initialize width, height, and depth of the Cuboid
	
	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;
	
	// Get and set the width of the Cudboid.
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	// Get and set the Height of the cuboid.

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	// Get and set the depth of the cuboid.

	public float getDepth() {
		return depth;
	}
	
	public void setDepth(float depth) {
		 this.depth = depth;
	}

	// Initialize a new Cuboid object
	
	public Cuboid(Dialog dialog, float width, float height, float depth) {
		super(dialog);
		
		// Validate Width
		if (width <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setWidth(width);
		}
		
		// Validate Height
		if (height <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setHeight(height);
		}
		
		// Validate Depth
		if (depth <= 0.0) {
			throw new IllegalArgumentException();
		} else {
			setDepth(depth);
		}
	}
	
	// Calculate the cuboid's surface area 
	@Override
	public float surfaceArea(){
		//SA = 2 ( W*H + H*D + D*H) 
		return 2.0f * (getHeight() * getWidth() +
						getWidth() * getDepth() +
						getDepth() * getHeight());
		

		
	}
	
	// Calculate the cuboid's volume 
	@Override
	public float volume(){
		// V = (D x H x W)
		
		return (getDepth() * getHeight() * getWidth());
		

	}

	public void render() {
		getDialog().show("Cuboid", "The surface Area of the Cuboid is: " + this.surfaceArea() + "\n The Volume of the Cuboid is: " + this.volume());
	}
	
}
