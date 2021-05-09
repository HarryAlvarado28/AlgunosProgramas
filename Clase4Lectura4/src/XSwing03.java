import javax.swing.*;
import java.awt.*;

class XSwing3 extends JFrame {
	static final long serialVersionUID = 0L;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;

	XSwing3() {
		setTitle("Curso de Java");
		b1 = new JButton("Boton1");
		b2 = new JButton("Boton2");
		b3 = new JButton("Boton3");
		b4 = new JButton("Boton4");
	}

	void crear() {
		getContentPane().setLayout(new GridLayout(2, 2));
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class XSwing03 {
	static final long serialVersionUID = 0L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwing3 obj = new XSwing3();
		obj.crear();
	}

}
