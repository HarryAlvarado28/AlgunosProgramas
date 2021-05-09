package clase2;

import javax.swing.*;

class XValidacion2 {
	private int numero;

	XValidacion2() {
		String str;
		str = JOptionPane.showInputDialog("Escribe un Numero:");
		numero = Integer.parseInt(str);
	}

	void validar() {
		if (numero < 0) {
			System.out.println("El numero es negativo.");
		} else {
			if (numero == 0) {
				System.out.println("El numero es cero.");
			} else {
				System.out.println("El numero es Positivo.");
			}
		}
	}
}

public class Validacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XValidacion2 val = new XValidacion2();
		val.validar();
	}

}
