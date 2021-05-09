class ClaseA11 {
	public double numero;

	ClaseA11() {
		numero = 12.5;
	}
}

class ClaseA111 extends ClaseA11 {
	public double numero;

	ClaseA111() {
		numero = 10.5;
	}

	void desplegar() {
		System.out.println("El valor de numero es: " + super.numero);
	}
}

public class XHerencia21 {
	public static void main(String[] args) {
		ClaseA111 s = new ClaseA111();
		s.desplegar();
	}
}