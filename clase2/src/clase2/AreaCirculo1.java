package clase2;

import javax.swing.JOptionPane;

class XAreaCirculo {
	private float radio;

	XAreaCirculo() {
		radio = 0;
	}

	void calcular() {
		String str_radio;
		str_radio = JOptionPane.showInputDialog("Escribe el Radio:");
		radio = Float.parseFloat(str_radio);
		System.out.print("El area del circulo de radio " + radio);
		double area = Math.PI * radio * radio;
		System.out.println(" es " + area);
	}
}

public class AreaCirculo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XAreaCirculo ar = new XAreaCirculo();
		ar.calcular();
	}

}
