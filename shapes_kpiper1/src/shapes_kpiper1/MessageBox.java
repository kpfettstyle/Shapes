/**
 * 
 */
package shapes_kpiper1;

import javax.swing.JOptionPane;

/**
 * @author piper
 *
 */
public class MessageBox implements Dialog {
	
	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title, 3);
		
		return JOptionPane.OK_OPTION;
	}

}
