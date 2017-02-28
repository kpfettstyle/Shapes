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
		Cuboid cuboid = new Cuboid(dialog);
		Cylinder cylinder = new Cylinder(dialog);
		Sphere sphere = new Sphere(dialog);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
		// Make a shapes factory
		ShapesFactory shapesFactory = new ShapesFactory();
		
		
		
	}
}
