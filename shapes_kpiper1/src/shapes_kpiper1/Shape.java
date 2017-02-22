/**
 * 
 */
package shapes_kpiper1;


/**
 * @author Kyle Piper
 *
 */
public abstract class Shape {
	
	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
	
	public Shape(Dialog dialog) {
		setDialog(dialog);
	}
		
}
	


