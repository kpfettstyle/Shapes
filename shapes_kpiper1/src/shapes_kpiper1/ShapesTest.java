/**
 * 
 */
package shapes_kpiper1;
import javax.swing.JOptionPane;

/**
 * @author piper
 *
 */
public class ShapesTest {
	public static void main(String[] args) {
		
		String shapeChoice; 
		
		// Ask the user for the shape
		//Scanner input = new Scanner(System.in);
		shapeChoice = JOptionPane.showInputDialog("Select a shape to calculate between Cuboid, Cylinder, or Sphere");
		//String userInput =  input.nextLine();
		
		if ("Cuboid".equals(shapeChoice) || "cuboid".equals(shapeChoice)) {
			
			// If user selected Cuboid then ask for dimensions
			
			String cuboidWidthString = JOptionPane.showInputDialog(null, "Please enter the Cuboid's width");
			float cuboidWidth = Float.parseFloat(cuboidWidthString);
			
			// Check to make sure the width is not a negative
			if (cuboidWidth < 0) {
				JOptionPane.showMessageDialog(null, "Please enter a positive number");
				
			}else {
			
				String cuboidHeightString = JOptionPane.showInputDialog(null, "Please enter the Cuboid's height");
				float cuboidHeight = Float.parseFloat(cuboidHeightString);
				
				// Check to make sure the Height is not a negative
				if (cuboidHeight < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a positive number");
					
				}else {
				
					String cuboidDepthString = JOptionPane.showInputDialog(null, "Please enter the Cuboid's depth");
					float cuboidDepth = Float.parseFloat(cuboidDepthString);
					
					// Check to make sure the depth is not a negative
					if (cuboidDepth < 0) {
						JOptionPane.showMessageDialog(null, "Please enter a positive number");
						
					}else {
						Shape cuboid = new Cuboid(cuboidWidth, cuboidHeight, cuboidDepth);
						
						JOptionPane.showMessageDialog(null, "The " + shapeChoice + "'s width is " + cuboidWidth + ". "
								+ "\n The height is " + cuboidHeight + ". "
								+ "\n The depth is " + cuboidDepth + ". "
								+ "\n The surface area is " + cuboid.surfaceArea() +"."
								+ "\n The Volume = " + cuboid.volume() + "." );
					}
				}
			}
			
			
		} else if ("Cylinder".equals(shapeChoice) || "cylinder".equals(shapeChoice)) {
			
			// If user selected Cylinder then ask for dimensions
			
			String cylinderRadiusString = JOptionPane.showInputDialog(null, "Please enter the Cylinder's Radius");
			float cylinderRadius = Float.parseFloat(cylinderRadiusString);
			
			// Check to make sure the radius is not a negative
			if (cylinderRadius < 0) {
				JOptionPane.showMessageDialog(null, "Please enter a positive number");
							
			}else {
			
				String cylinderHeightRadius = JOptionPane.showInputDialog(null, "Please enter the Cylinder's height");
				float cylinderHeight = Float.parseFloat(cylinderHeightRadius);
				
				// Check to make sure the height is not a negative
				if (cylinderHeight < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a positive number");
								
				}else {
				
					Shape cylinder = new Cylinder(cylinderRadius, cylinderHeight);
					
					JOptionPane.showMessageDialog(null, "The " + shapeChoice + "'s Radius is " + cylinderRadius + ". "
							+ "\n The height is " + cylinderHeight + ". "
							+ "\n The surface area is " + cylinder.surfaceArea() +"."
							+ "\n The Volume = " + cylinder.volume() + "." );
				}
				
			}
			
		} else if ("Sphere".equals(shapeChoice) || "sphere".equals(shapeChoice)) {
			
			// If user selected Sphere then ask for dimensions
			
			String sphereRadiusString = JOptionPane.showInputDialog(null, "Please enter the Sphere's Radius");
			float sphereRadius = Float.parseFloat(sphereRadiusString);
			
			// Check to make sure the radius is not a negative
			if (sphereRadius < 0) {
				JOptionPane.showMessageDialog(null, "Please enter a positive number");
							
			}else {
			
				Shape sphere = new Sphere (sphereRadius);
				
				JOptionPane.showMessageDialog(null, "The " + shapeChoice + "'s Radius is " + sphereRadius + ". "
						+ "\n The surface area is " + sphere.surfaceArea() +"."
						+ "\n The Volume = " + sphere.volume() + "." );
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Please selecte between Cuboid, Cylinder, or Sphere");
		}
	
		
		 
	}
}
