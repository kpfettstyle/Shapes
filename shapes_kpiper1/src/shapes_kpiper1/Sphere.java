/**
 * 
 */
package shapes_kpiper1;

/**
 * @author piper
 *
 */
public class Sphere extends Shape{
	
	// establish Sphere's radius
	
	private float sphereRadius;
	
	public Sphere(){
		this(0);
	}
	
	public Sphere(float sphereRadius){
		this.sphereRadius = sphereRadius;
	}
	
	// Calculate the surface area and the volume of the Sphere
	
	@Override
	public float surfaceArea() {
		// A = 4piR^2
		return (float) (4 * Math.PI * Math.pow(sphereRadius, 2));	
		}
	
	@Override
	public float volume() {
		// V = (4/3)*piR^3
		return (float) ((4 / 3) * Math.PI * Math.pow(sphereRadius, 3));
		
	}

}
