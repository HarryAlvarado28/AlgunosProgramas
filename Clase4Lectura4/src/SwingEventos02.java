
/**
 * 
 */

/**
 * @author harry
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class XSwingEventos2 extends JFrame {
	JButton bt1 = new JButton("Aceptar");
	JButton bt2 = new JButton("Cancelar");
	JLabel lb1 = new JLabel("Muestra de Eventos SWING");
	JTextField tf1 = new JTextField();
	JLabel lb2 = new JLabel("Introduce tu Nombre");

	XSwingEventos2() {
		setTitle("Java - UP - 2021");
		setBounds(150, 150, 350, 350);
		getContentPane().setLayout(null);
		lb1.setBounds(new Rectangle(50, 1, 230, 20));
		lb2.setBounds(new Rectangle(20, 30, 150, 20));
		tf1.setBounds(new Rectangle(150, 30, 100, 20));
		bt1.setBounds(new Rectangle(20, 60, 100, 20));
		bt2.setBounds(new Rectangle(150, 60, 100, 20));
	}

	void arma_pantalla() {
		getContentPane().add(lb1, null);
		getContentPane().add(bt1, null);
		getContentPane().add(bt2, null);
		getContentPane().add(lb2, null);
		getContentPane().add(tf1, null);
		// este es el metodo para manejo de eventos
		bt1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String wnombre;
				wnombre = tf1.getText();
				System.out.println("Nombre Capturado es: " + wnombre);
			}
		});

		bt2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// dispose();
				setVisible(false);
			}
		});

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class SwingEventos02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingEventos2 ap = new XSwingEventos2();
		ap.arma_pantalla();
	}

}
