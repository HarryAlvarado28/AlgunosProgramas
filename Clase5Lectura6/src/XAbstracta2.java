
abstract class Operaciones {
	abstract void sumar();

	abstract void restar();
}

class ClaseFuncional extends Operaciones {
	void sumar() {
		int a = 4, b = 3;
		int sum = a + b;
		System.out.println("Suma: " + sum);
	}

	void restar() {
		int a = 400, b = 300, c = 9;
		int res = a - b - c;
		System.out.println("Resta: " + res);
	}
}

public class XAbstracta2 {
	public static void main(String[] args) {
		ClaseFuncional ob = new ClaseFuncional();
		ob.sumar();
		ob.restar();
	}
}