class ClaseBase {
	public int dato1, dato2;

	ClaseBase() {
		dato1 = 5;
		dato2 = 2;
	}

	int procesar_suma() {
		return (dato1 + dato2);
	}

	int procesar_resta() {
		return (dato1 - dato2);
	}
}

class ClaseDerivada extends ClaseBase {
	private int dato3;

	ClaseDerivada() {
		dato3 = 3;
	}

	int procesar_multiplicacion() {
		return (dato1 * dato2 * dato3);
	}
}

public class XHerencia1 {
	public static void main(String[] args) {
		ClaseDerivada objeto = new ClaseDerivada();
		System.out.println("Sumatoria de Valores " + objeto.procesar_suma());
		System.out.println("Resta de Valores " + objeto.procesar_resta());
		System.out.println("Multiplicacion de Valores" + objeto.procesar_multiplicacion());
	}
}