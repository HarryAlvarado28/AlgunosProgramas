
/**
 * 
 */

/**
 * @author harry
 *
 */
import javax.swing.*;

class XSwingTab extends JFrame {
	JTabbedPane tab = new JTabbedPane();

//JTabbedPane tab = new JTabbedPane((SwingConstants.RIGHT));
	void buildtab() {
		setTitle("Swing: TabbedPane");
		setBounds(125, 125, 400, 300);
		setVisible(true);
//Crea los tab e invoca clases para cada tab 
		tab.addTab("Ingresar Datos", null);
		tab.addTab("Buscar Informacion", null);
		tab.addTab("Consultas Varias", null);
		getContentPane().add(tab);
	}
}

public class SwingTab {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSwingTab p = new XSwingTab();
		p.buildtab();
	}

}
