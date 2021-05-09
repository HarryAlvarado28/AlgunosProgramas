class ClaseA {
	public double numero;

	ClaseA() {
		numero = 12.5;
	}
}

class ClaseA1 extends ClaseA {
	public double numero;

	ClaseA1() {
		numero = 10.5;
	}
}

public class XHerencia2 {
	public static void main(String[] args) {
		ClaseA1 s = new ClaseA1();
		System.out.println("El valor de numero es: " + s.numero);
	}
}