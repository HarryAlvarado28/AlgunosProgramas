abstract class ClaseAb1 {
	abstract void metodoAbstracto1();

	abstract void metodoAbstracto2();

	void metodoConcreto() {
		System.out.println("En el metodo concreto de Clase A");
	}
}

class ClaseAb2 extends ClaseAb1 {
	void metodoAbstracto2() {
		System.out.println("En el metodo abstracto de claseB");
	}

	void metodoAbstracto1() {
		System.out.println("En el metodo abstracto de claseB");
	}
}

public class XAbstracta1 {
	public static void main(String[] args) {
		ClaseAb2 ob = new ClaseAb2();
		ob.metodoAbstracto1();
		ob.metodoConcreto();
	}
}