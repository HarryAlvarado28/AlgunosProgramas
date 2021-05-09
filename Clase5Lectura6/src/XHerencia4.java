class SuperClase {
	protected int dato;

	SuperClase(int pDato) {
		System.out.println("Dentro del constructor de la SuperClase");
		dato = pDato;
	}

	void DesplegarDato() {
		System.out.println("La variable contiene " + dato);
	}
}

class SubClase extends SuperClase {
	SubClase(int bDato) {
		super(bDato);
		System.out.println("Dentro del constructor de la SubClase");
	}
}

public class XHerencia4 {
	public static void main(String args[]) {
		System.out.println("Lanzando la aplicacion");
		SubClase obj = new SubClase(100);
		obj.DesplegarDato();
	}
}