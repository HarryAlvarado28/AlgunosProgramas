import java.util.*;

class XVector2 implements Enumeration {
	Vector frutas = new Vector();

	void desplegar() {
		frutas.addElement("NARANJA");
		frutas.addElement("MANGO");
		frutas.addElement("UVA");
		frutas.addElement("PIÑA");
		for (int i = 0; i < frutas.size(); i++) {
			System.out.print(frutas.elementAt(i) + "\t");
		}
		System.out.println("Numero de elementos " + frutas.size());
		hasMoreElements();
		nextElement();
	}

	public boolean hasMoreElements() {
		Enumeration en = frutas.elements();
		System.out.println("Los elementos del Vector");
		while (en.hasMoreElements()) {
			System.out.print(en.nextElement() + "\t");
		}
		return false;
	}

	public Object nextElement() {
		return null;
	}
}

public class IntVector1 {
	public static void main(String[] args) {
		XVector2 dv = new XVector2();
		dv.desplegar();
	}
}