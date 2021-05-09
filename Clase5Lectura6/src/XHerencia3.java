class ClaseB {
	protected int dato1;

	ClaseB() {
		dato1 = 50;
	}

	void calcular() {
		int resp = dato1 + 100;
		System.out.println("Valor = " + resp);
	}
}

class ClaseB1 extends ClaseB {
	void calcular() {
		int var1 = 18, var2;
		var2 = (var1 + 2) / 4;
		dato1 = var2 * 10;
		System.out.println("Valor = " + dato1);
	}
}

public class XHerencia3 {
	public static void main(String[] args) {
		ClaseB1 objeto = new ClaseB1();
		objeto.calcular();
	}
}