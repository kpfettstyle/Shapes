package shapes_kpiper1;

public class ShapesFactory {
	
	//Create a dialog for the shapes to use
	private Dialog dialog;
	
	private Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public void ShapeFactory(Dialog dialog) {
		setDialog(dialog);
		getDialog();
	}
	
	public Cuboid makeCuboid(float height, float width, float depth) {
		return new Cuboid(dialog, height, width, depth);
	}
	
	public Cylinder makeCylinder(float radius, float height) {
		return new Cylinder(dialog, radius, height);
	}
	
	public Sphere makeSphere(float radius) {
		return new Sphere(dialog, radius);
	}
}
