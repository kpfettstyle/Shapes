package shapes_kpiper1_tests;


import org.junit.Test;

import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;
import shapes_kpiper1.Sphere;

public class SphereUnitTest {
	
	@Test
	public void test() {
		// 1. Arrange
		Dialog dialog = new MessageBox();
		MessageBox dialogSub = new MessageBox();
		Sphere sphere = new Sphere(dialogSub);
		
		// 2. Act/Assert
		sphere.render();
	}
	
}
