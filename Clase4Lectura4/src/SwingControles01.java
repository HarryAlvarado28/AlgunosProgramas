
/**
 * 
 */

/**
 * @author harry
 *
 */
import java.awt.*;
import javax.swing.*;

class XSwingControles extends JFrame {
	static final long serialVersionUID = 0L;

	JLabel lb1 = new JLabel("MUESTRA DE COMPONENTES BASICOS DE SWING");
	JLabel lb2 = new JLabel("Muestra de JTEXTFIELD");
	JTextField tf1 = new JTextField();

	JLabel lb3 = new JLabel("Muestra de JPASSWORDFIELD");
	JPasswordField p1 = new JPasswordField(10);

	JLabel lb4 = new JLabel("Muestra de JCHECKBOX");
	JCheckBox cb1 = new JCheckBox("Cine");
	JCheckBox cb2 = new JCheckBox("Leer");

	JLabel lb5 = new JLabel("Muestra de JRADIOBUTTON");
	JRadioButton rb1 = new JRadioButton();
	JRadioButton rb2 = new JRadioButton();

	JLabel lb6 = new JLabel("Muestra de JCOMBOBOX");
	String grado[] = { "I GRADO", "II GRADO", "III GRADO", "IV GRADO", "V GRADO", "VI GRADO" };
	JComboBox combo = new JComboBox(grado);

	JLabel lb7 = new JLabel("Muestra de JLIST");
	DefaultListModel dlm = new DefaultListModel();
	JList lista = new JList();

	JLabel lb8 = new JLabel("Muestra de JBUTTON");
	JButton bt1 = new JButton("OK");
	JButton bt2 = new JButton("CANCELAR");

	public XSwingControles() {
		setTitle(" ESTE ES EL TITULO DE LA VENTANA");
		setBounds(150, 150, 450, 400);
		getContentPane().setLayout(null);

		lb1.setBounds(new Rectangle(80, 10, 300, 20));

		lb2.setBounds(new Rectangle(20, 60, 150, 20));
		tf1.setBounds(new Rectangle(200, 60, 100, 20));

		lb3.setBounds(new Rectangle(20, 90, 250, 20));
		p1.setBounds(new Rectangle(200, 90, 100, 20));

		lb4.setBounds(new Rectangle(20, 120, 150, 20));
		cb1.setBounds(new Rectangle(200, 120, 60, 20));
		cb2.setBounds(new Rectangle(300, 120, 100, 20));

		lb5.setBounds(new Rectangle(20, 150, 250, 20));
		rb1.setBounds(new Rectangle(200, 150, 100, 20));
		rb2.setBounds(new Rectangle(300, 150, 100, 20));
		lb6.setBounds(new Rectangle(20, 180, 200, 20));
		combo.setBounds(new Rectangle(200, 180, 150, 20));

		dlm.addElement("GALLETAS");
		dlm.addElement("JUGOS");
		dlm.addElement("GOLOSINAS");
		dlm.addElement("DULCES");
		lista.setModel(dlm);

		lb7.setBounds(new Rectangle(20, 210, 200, 20));
		lista.setBounds(new Rectangle(200, 210, 150, 70));

		lb8.setBounds(new Rectangle(20, 300, 150, 20));
		bt1.setBounds(new Rectangle(200, 300, 100, 20));
		bt2.setBounds(new Rectangle(320, 300, 120, 20));

		getContentPane().add(lb1, null);

		getContentPane().add(lb2, null);
		getContentPane().add(tf1, null);

		getContentPane().add(lb3, null);
		getContentPane().add(p1, null);

		getContentPane().add(lb4, null);
		getContentPane().add(cb1, null);
		getContentPane().add(cb2, null);

		rb1.setText("Niño");
		rb2.setText("Niña");

		getContentPane().add(lb5, null);
		getContentPane().add(rb1, null);
		getContentPane().add(rb2, null);

		getContentPane().add(lb6, null);
		getContentPane().add(combo, null);

		getContentPane().add(lb7, null);
		getContentPane().add(lista, null);

		getContentPane().add(lb8, null);
		getContentPane().add(bt1, null);
		getContentPane().add(bt2, null);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class SwingControles01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingControles ap = new XSwingControles();
	}

}
