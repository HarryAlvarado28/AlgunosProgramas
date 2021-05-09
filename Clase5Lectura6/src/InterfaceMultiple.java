interface InterfaceDatos {
	public final double pi = 3.14;
	public final int constanteInt = 125;
}

interface InterfaceMetodos {
	void put(int dato);

	int get();
}

class ClasePruebaA implements InterfaceDatos, InterfaceMetodos {
	double dDato;

	// implementa los metodos put() y get()
	public void put(int dato) {
// Se usa "pi" del InterfaceDatos
		dDato = dato * pi;
		System.out.println("En put() de ClasePruebaA, usando pi del InterfaceDatos: " + dDato);
	}

	public int get() {
		return ((int) dDato);
	}

// Se define un metodo show() para la ClasePruebaA que no esta declarado en el interface
	void show() {
		System.out.println("En show() de ClasePruebaA, dDato = " + dDato);
	}
}

class ClasePruebaB implements InterfaceDatos, InterfaceMetodos {
	int dDato;

	// implementa los metodos put() y get()
	public void put(int dato) {
// Se usa "constanteInt" del InterfaceDatos
		dDato = dato * constanteInt;
		System.out.println("En put() de ClasePruebaB, del InterfaceDatos: " + dDato);
	}

	public int get() {
		return (dDato);
	}
}

class InterfaceMultiple {
	public static void main(String args[]) {
		System.out.println("Instancia objA de tipo ClasePruebaA, coloca datos y los muestra.");
		ClasePruebaA objA = new ClasePruebaA();
		objA.put(2);
		objA.show();
		System.out.println("\n Asigna objA al objeto de tipo InterfaceMetodos llamada objAA.");
		InterfaceMetodos objAA = objA;
		System.out.println("Invoca el metodo put() sobre objAA para modificar los datos.");
		objAA.put(4);
		System.out.println("Invoca get() sobre objAA para ver los datos modificados.");
		System.out.println("dato objA = " + objAA.get());
		System.out.println("\n Instancia un objeto de tipo ClasePruebaB llamado objB.\n");
		System.out.println("Asigna inmediatamente la refrencia a una variable de referecia");
		System.out.println("de tipo InterfaceMetodos en lugar de a una variable de tipo ClaseB");
		InterfaceMetodos objB = new ClasePruebaB();
		System.out.println("Invoca a su metodo put() para guardar datos.");
		objB.put(2);
		System.out.println("Invoca su metodo get() para visualizar los datos.");
		System.out.println("dato objB = " + objB.get());
		System.out.println("Fin del programa.");
	}
}