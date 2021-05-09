import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ArmaMenu extends JFrame implements ActionListener {
	JMenuBar mbarra = new JMenuBar();
	JMenu mfile = new JMenu("File");
	JMenuItem mnew = new JMenuItem("New");
	JMenuItem mopen = new JMenuItem("Open");
	JMenuItem msave = new JMenuItem("Save As");
	JMenuItem mexit = new JMenuItem("Exit");
	JMenu medit = new JMenu("Edit");
	JMenuItem mcut = new JMenuItem("Cut");
	JMenuItem mcopy = new JMenuItem("Copy");
	JMenuItem mpaste = new JMenuItem("Paste");
	JMenuItem mfind = new JMenuItem("Find");

	public ArmaMenu() { // Menu
		mfile.add(mnew);
		mfile.add(mopen);
		mfile.add(msave);
		mfile.add(mexit);
		medit.add(mcut);
		medit.add(mcopy);
		medit.add(mpaste);
		medit.addSeparator();
//Pone una linea horizontal de separacion 
		medit.add(mfind);
		mbarra.add(mfile);
		mbarra.add(medit);
//Añadimos la barra al JFrame 
		setJMenuBar(mbarra);
		setTitle("Ejemplo de JMenu en java");
		setSize(800, 600);
		setVisible(true);
		mopen.addActionListener(this);
		mexit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Open")) {
			JOptionPane.showMessageDialog(this, "Éste es un ejemplo\ndel uso de menús", "Opcion Open-Menu File",
					JOptionPane.PLAIN_MESSAGE);
		}
		if (e.getActionCommand().equals("Exit")) { // dispose();
			setVisible(false);
		}
	}
}

class SwingMenu { // Elementos del Menu
	public static void main(String[] args) {
		ArmaMenu am = new ArmaMenu();
	}
}