interface A {
	public void sumar();

	public void restar();
}

interface B extends A {
	public void multiplicar();

	public void dividir();
}

interface C extends A {
	public int num1 = 10;
	public int num2 = 5;
}

class D implements B, C {
	public void sumar() {
		System.out.println("LA SUMA ES:" + (num1 + num2));
	}

	public void restar() {
		System.out.println("LA RESTA ES:" + (num1 - num2));
	}

	public void multiplicar() {
		System.out.println("LA MULTIPLICACION ES:" + (num1 * num2));
	}

	public void dividir() {
		System.out.println("LA DIVISION ES:" + (num1 / num2));
	}
}

public class InterfacePrueba {
	public static void main(String[] args) {
		D od = new D();
		od.sumar();
		od.restar();
		od.multiplicar();
		od.dividir();
		B ob=od;
		ob.dividir();
	}

}