
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;

public class Prog03EditorTexto extends JFrame implements ActionListener {
	JTextArea jtarea;
	JFrame jframe;

	Prog03EditorTexto() {
		jframe = new JFrame("editor");
		setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			MetalLookAndFeel.setCurrentTheme(new OceanTheme());
		} catch (Exception e) {
		}

		jtarea = new JTextArea();

		JMenuBar jmbar = new JMenuBar();
		JMenu jmenu1 = new JMenu("File");
		JMenuItem mi1 = new JMenuItem("New");
		JMenuItem mi2 = new JMenuItem("Open");
		JMenuItem mi3 = new JMenuItem("Save as");
		JMenuItem mi9 = new JMenuItem("Print");
		JMenuItem mc = new JMenuItem("Exit");

		// Añadiendo action listener
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi9.addActionListener(this);
		mc.addActionListener(this);

		// añadiendo elementos al submenu
		jmenu1.add(mi1);
		jmenu1.add(mi2);
		jmenu1.add(mi3);
		jmenu1.add(mi9);
		jmenu1.add(mc);

		// Creando menu Edit
		JMenu jmenu2 = new JMenu("Edit");

		// Creando items del menu edit
		JMenuItem mi4 = new JMenuItem("cut");
		JMenuItem mi5 = new JMenuItem("copy");
		JMenuItem mi6 = new JMenuItem("paste");

		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);

		jmenu2.add(mi4);
		jmenu2.add(mi5);
		jmenu2.add(mi6);

		// Creando menu Edit
		JMenu jmenu3 = new JMenu("Project");

		// Creando items del menu edit
		JMenuItem mi7 = new JMenuItem("new project");
		JMenuItem mi8 = new JMenuItem("open project");
		JMenuItem mi10 = new JMenuItem("save project");
		JMenuItem mi11 = new JMenuItem("close project");

		// Add action listener
		mi7.addActionListener(this);
		mi8.addActionListener(this);
		mi9.addActionListener(this);
		mi11.addActionListener(this);

		jmenu3.add(mi7);
		jmenu3.add(mi8);
		jmenu3.add(mi9);
		jmenu3.add(mi11);

		jmbar.add(jmenu1);
		jmbar.add(jmenu2);
		jmbar.add(jmenu3);

		jframe.setJMenuBar(jmbar);
		jframe.add(jtarea);
		jframe.setSize(500, 500);
		jframe.show();
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();

		if (s.equals("cut")) {
			jtarea.cut();
		} else if (s.equals("copy")) {
			jtarea.copy();
		} else if (s.equals("paste")) {
			jtarea.paste();
		} else if (s.equals("Save as")) {
			JFileChooser j = new JFileChooser("jframe:");

			int r = j.showSaveDialog(null);

			if (r == JFileChooser.APPROVE_OPTION) {

				// Set the label to the path of the selected directory
				File fi = new File(j.getSelectedFile().getAbsolutePath());

				try {
					// Creando un escritor de archivos
					FileWriter wr = new FileWriter(fi, false);

					// Creando buffered para escribir
					BufferedWriter w = new BufferedWriter(wr);

					w.write(jtarea.getText());

					w.flush();
					w.close();
				} catch (Exception evt) {
					JOptionPane.showMessageDialog(jframe, evt.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(jframe, "the user cancelled the operation");
		} else if (s.equals("Print")) {
			try {
				jtarea.print();
			} catch (Exception evt) {
				JOptionPane.showMessageDialog(jframe, evt.getMessage());
			}
		} else if (s.equals("Open")) {
			JFileChooser j = new JFileChooser("jframe:");

			int r = j.showOpenDialog(null);

			if (r == JFileChooser.APPROVE_OPTION) {
				File fi = new File(j.getSelectedFile().getAbsolutePath());

				try {
					String s1 = "", sl = "";

					FileReader fr = new FileReader(fi);

					BufferedReader br = new BufferedReader(fr);

					sl = br.readLine();

					while ((s1 = br.readLine()) != null) {
						sl = sl + "\n" + s1;
					}

					jtarea.setText(sl);
				} catch (Exception evt) {
					JOptionPane.showMessageDialog(jframe, evt.getMessage());
				}
			} else
				JOptionPane.showMessageDialog(jframe, "the user cancelled the operation");
		} else if (s.equals("New")) {
			jtarea.setText("");
		} else if (s.equals("Exit")) {
			jframe.setVisible(false);
		}
	}

	public static void main(String args[]) {
		Prog03EditorTexto editorTexto = new Prog03EditorTexto();
	}
}
