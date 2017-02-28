package shapes_kpiper1;

public class ShapesFactory {
	
	

	public Shape makeCuboid(Dialog dialog) {
		return new Cuboid(dialog);
	}
	
	public Shape makeCylinder(Dialog dialog) {
		return new Cylinder(dialog);
	}
	
	public Shape makeSphere(Dialog dialog) {
		return new Sphere(dialog);
	}
	
}
