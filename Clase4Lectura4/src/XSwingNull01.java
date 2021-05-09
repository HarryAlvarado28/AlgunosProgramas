import java.awt.*;
import javax.swing.*;

class XSwingNull extends JFrame {
	static final long serialVersionUID = 0L;
	JButton bt1 = new JButton("OK");
	JButton bt2 = new JButton("CANCELAR");
	JLabel lb1 = new JLabel("Muestra de Layout Null");
	JTextField tf1 = new JTextField();
	JLabel lb2 = new JLabel("Introduce tu Nombre");

	public XSwingNull() {
		setTitle(" Java - UP - 2021");
		setBounds(150, 150, 350, 350);
		getContentPane().setLayout(null);
		lb1.setBounds(new Rectangle(80, 1, 230, 20));
		lb2.setBounds(new Rectangle(20, 30, 150, 20));
		tf1.setBounds(new Rectangle(150, 30, 100, 20));
		bt1.setBounds(new Rectangle(20, 60, 100, 20));
		bt2.setBounds(new Rectangle(150, 60, 100, 20));
		getContentPane().add(lb1, null);
		getContentPane().add(bt1, null);
		getContentPane().add(bt2, null);
		getContentPane().add(lb2, null);
		getContentPane().add(tf1, null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class XSwingNull01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingNull ap = new XSwingNull();
	}

}
