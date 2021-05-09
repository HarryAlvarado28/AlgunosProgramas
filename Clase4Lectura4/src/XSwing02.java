
/**
 * 
 */

/**
 * @author harry
 *
 */
import javax.swing.*;
import java.awt.*;

class XSwing2 extends JFrame {
	static final long serialVersionUID = 0L;
	private JButton b1;
	private JButton b2;
	private JButton b3;

	XSwing2() {
		setTitle("Curso de Java");
		b1 = new JButton("Boton1");
		b2 = new JButton("Boton2");
		b3 = new JButton("Boton3");
	}

	void crear() {
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		b1.setToolTipText("Activa el boton no.1");
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class XSwing02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwing2 obj = new XSwing2();
		obj.crear();
	}

}
