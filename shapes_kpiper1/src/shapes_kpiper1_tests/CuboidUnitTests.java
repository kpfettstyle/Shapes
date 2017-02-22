package shapes_kpiper1_tests;

import org.junit.Test;

import shapes_kpiper1.Cuboid;
import shapes_kpiper1.Dialog;
import shapes_kpiper1.MessageBox;


public class CuboidUnitTests {
	
	@Test
	public void test() {
		// 1. Arrange
		Dialog dialog = new MessageBox();
		MessageBox dialogSub = new MessageBox();
		Cuboid cuboid = new Cuboid(dialogSub);
		
		// 2. Act/Assert
		cuboid.render();
	}
}
