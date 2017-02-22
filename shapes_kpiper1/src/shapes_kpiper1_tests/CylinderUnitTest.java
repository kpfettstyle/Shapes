package shapes_kpiper1_tests;


import org.junit.Test;

import shapes_kpiper1.Cylinder;
import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;

public class CylinderUnitTest {
	
	@Test
	public void test() {
		// 1. Arrange
		Dialog dialog = new MessageBox();
		MessageBox dialogSub = new MessageBox();
		Cylinder cylinder = new Cylinder(dialogSub);
		
		// 2. Act/Assert
		cylinder.render();
	}

}
