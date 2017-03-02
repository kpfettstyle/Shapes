package shapes_kpiper1_tests;

import org.junit.Test;

import shapes_kpiper1.Cuboid;
import shapes_kpiper1.Cylinder;
import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;
import shapes_kpiper1.ShapesFactory;
import shapes_kpiper1.Sphere;

public class FactoryUnitTests {

	Dialog dialog = new MessageBox();
	MessageBoxSub dialogSub = new MessageBoxSub();
	
	// Unit test for Cuboid creation in the new Shapes Factory
	@Test
	public void cuboidFactoryUnitTest() {
		ShapesFactory shapeFactory = new ShapesFactory();
		
		Cuboid cuboid = shapeFactory.makeCuboid(10,4,5);
		
		cuboid.render();
	}

	
	// Unit test for Cylinder creation in the new Shapes Factory
	@Test
	public void cylinderFactoryUnitTest() {
		ShapesFactory shapeFactory = new ShapesFactory();
		
		Cylinder cylinder = shapeFactory.makeCylinder(4,5);
		
		cylinder.render();
	}
	
	// Unit test for Sphere creation in the new Shapes Factory
	@Test
	public void sphereFactoryUnitTest() {
		ShapesFactory shapeFactory = new ShapesFactory();
		
		Sphere sphere = shapeFactory.makeSphere(5);
		
		sphere.render();
	}
}
