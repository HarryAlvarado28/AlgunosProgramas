package clase2;

import javax.swing.JOptionPane;

class XLeeData {
	String nombre, apellido;

	XLeeData() {
		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Escribe tu Apellido:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
	}

	void desplegar() {
		String nombre_completo;
		nombre_completo = nombre + " " + apellido;
		JOptionPane.showMessageDialog(null, nombre_completo, "Tu Nombre Completoes:", JOptionPane.INFORMATION_MESSAGE);
	}
}

public class LeeData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XLeeData ld = new XLeeData();
		ld.desplegar();
	}
}
