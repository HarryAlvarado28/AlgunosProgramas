import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class XSwingEventos1 extends JFrame implements ActionListener {
	JButton bt1 = new JButton("Aceptar");
	JButton bt2 = new JButton("Cancelar");
	JTextField tf1 = new JTextField();
	JLabel lb1 = new JLabel("Introduce tu Nombre");

	XSwingEventos1() {
		setTitle("Java - UTP - 2010");
		setBounds(150, 150, 350, 200);
		getContentPane().setLayout(null);
	}

	void arma_pantalla() {
		lb1.setBounds(new Rectangle(20, 30, 150, 20));
		tf1.setBounds(new Rectangle(150, 30, 100, 20));
		bt1.setBounds(new Rectangle(20, 60, 100, 20));
		bt2.setBounds(new Rectangle(150, 60, 100, 20));
		getContentPane().add(bt1, null);
		getContentPane().add(bt2, null);
		getContentPane().add(lb1, null);
		getContentPane().add(tf1, null);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Aceptar")) {
			System.out.println("Nombre Capturado es: " + tf1.getText());
		}
	}
}

public class IntSwing1 {
	public static void main(String args[]) {
		XSwingEventos1 ap = new XSwingEventos1();
		ap.arma_pantalla();
	}
}