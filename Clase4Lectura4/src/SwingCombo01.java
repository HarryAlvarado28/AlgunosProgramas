
/**
 * 
 */

/**
 * @author harry
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class XSwingCombo extends JFrame {
	JComboBox combo;

	XSwingCombo() {
		String facultad[] = { "CIVIL", "ELECTRICA", "SISTEMAS", "MECANICA" };
		setTitle("Creando un JComboBox ");
		setBounds(150, 150, 350, 350);
		getContentPane().setLayout(null);

		combo = new JComboBox(facultad);
		combo.setBounds(new Rectangle(50, 3, 230, 20));
		getContentPane().add(combo);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}

public class SwingCombo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingCombo b = new XSwingCombo();
	}

}
