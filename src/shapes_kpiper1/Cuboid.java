/**
 * 
 */
package shapes_kpiper1;


/**
 * @author piper
 *
 */
public class Cuboid extends Shape {
	
	// Establish Cuboid's width, height, and depth
	
	private float cuboidWidth, cuboidHeight, cuboidDepth;
	
	public Cuboid() {
		this(0,0,0);
	}
	public Cuboid(float cuboidWidth, float cuboidHeight, float cuboidDepth) {
		this.cuboidWidth = cuboidWidth;
		this.cuboidHeight = cuboidHeight;
		this.cuboidDepth = cuboidDepth;
	}
	
	
	// Calculate Cuboid's surface area and volume.
	@Override
	public float surfaceArea(){
		//SA = 2 ( W*H + H*D + D*H) 
		return 2.0f * (cuboidHeight * cuboidWidth +
						cuboidWidth * cuboidDepth +
						cuboidDepth * cuboidHeight);
	}
	
	@Override
	public float volume(){
		// V = (D x H x W)
		
		return (cuboidDepth * cuboidHeight * cuboidWidth);
	}
		
	
}
