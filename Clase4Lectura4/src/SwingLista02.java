import javax.swing.*;
import java.awt.*;

class XSwingLista extends JFrame {
	private DefaultListModel dlm = new DefaultListModel();
	private JList lista = new JList();

	XSwingLista() {
		dlm.addElement("INDIVIDUAL");
		dlm.addElement("CORPORATIVO");
		dlm.addElement("EMPRESARIAL");
		dlm.addElement("VIP");
		dlm.addElement("GOLD");
		dlm.addElement("PLATINUM");
		setTitle("Creando un JList ");
		setBounds(150, 150, 350, 350);
		getContentPane().setLayout(null);

		lista.setModel(dlm);

		lista.setBounds(new Rectangle(50, 3, 100, 110));
		getContentPane().add(lista, null);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class SwingLista02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingLista sl = new XSwingLista();
	}

}
