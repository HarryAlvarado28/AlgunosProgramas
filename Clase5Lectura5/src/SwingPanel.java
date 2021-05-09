
/**
 * 
 */

/**
 * @author harry
 *
 */
import java.awt.*;
import javax.swing.*;

class XSwingPanel extends JFrame {
	private JPanel panelBotones;
	private JPanel panelEtiquetas;
	private JButton botones[];
	private JLabel etiquetas[];

	void mostrar() {
		setTitle("Demostración JPanel");
		botones = new JButton[5];
		etiquetas = new JLabel[4];
		panelEtiquetas = new JPanel();
		panelEtiquetas.setLayout(new FlowLayout());
		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1, botones.length));
		for (int cuenta = 0; cuenta < botones.length; cuenta++) {
			botones[cuenta] = new JButton("Botón " + (cuenta + 1));
			panelBotones.add(botones[cuenta]);
		}
		for (int cuenta = 0; cuenta < etiquetas.length; cuenta++) {
			etiquetas[cuenta] = new JLabel("Etiqueta " + (cuenta + 1));
			panelEtiquetas.add(etiquetas[cuenta]);
		}
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		getContentPane().add(panelEtiquetas, BorderLayout.NORTH);
		setSize(425, 150);
		setVisible(true);
	}
}

public class SwingPanel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingPanel ap = new XSwingPanel();
		ap.mostrar();
		ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
