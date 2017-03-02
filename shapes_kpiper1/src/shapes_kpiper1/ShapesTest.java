/**
 * 
 */
package shapes_kpiper1;

/**
 * @author piper
 *
 */
public class ShapesTest {
	
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		// Create a new instance of shapes factory
		ShapesFactory shapeFactory = new ShapesFactory();
		
		// Test the Cuboid object with a 10 width, 5 height, and 2 depth
		Cuboid cuboid = shapeFactory.makeCuboid(10,5,2);
		
		// Test the Cylinder object with an 8 width, and 3 height.
		Cylinder cylinder = shapeFactory.makeCylinder(8,3);
		
		// Test the Sphere object with a 4 radius
		Sphere sphere = shapeFactory.makeSphere(4);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}
}
