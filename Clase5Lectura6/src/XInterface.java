interface Animal {
	public void locomocion();

	public void comer();
}

class Tiburon implements Animal {
	public void locomocion() {
		System.out.println("A MI ME GUSTA NADAR");
	}

	public void comer() {
		System.out.println("Y COMER SALMONES");
	}
}

class Perro implements Animal {
	public void locomocion() {
		System.out.println("A MI ME GUSTA CORRER");
	}

	public void comer() {
		System.out.println("Y COMER ASCAN");
	}
}

class XInterface {
	public static void main(String args[]) {
		Tiburon t = new Tiburon();
		t.locomocion();
		t.comer();
		Perro p = new Perro();
		p.locomocion();
		p.comer();
	}
}