import javax.swing.*;

class XSwing1 {
	static final long serialVersionUID = 0L;
	JLabel label;
	JFrame fra = new JFrame();

	XSwing1() {
		fra.setTitle(" USO DE SWING ");
		label = new JLabel("Bienvenidos Todos");
	}

	void crear() {
		fra.getContentPane().add(label);
		fra.pack();
		fra.setVisible(true);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class estructuraBasicaSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwing1 obj = new XSwing1();
		obj.crear();
	}

}
