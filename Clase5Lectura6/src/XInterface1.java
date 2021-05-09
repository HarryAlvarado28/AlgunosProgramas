interface Area {
	public int area();
}

class Cuadrado implements Area {
	int lado;

	public Cuadrado(int ladoParametro) {
		lado = ladoParametro;
	}

	public int area() {
		return lado * lado;
	}
}

class XInterface1 {
	public static void main(String args[]) {
		Cuadrado figura = new Cuadrado(5);
		System.out.println(figura.area());
	}
}