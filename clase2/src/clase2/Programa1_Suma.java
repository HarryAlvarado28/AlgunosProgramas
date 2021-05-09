package clase2;

public class Programa1_Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		n1 = 5;
		n2 = 4;
		Suma s = new Suma(n1, n2);
		s.desplegar();
	}

}

class Suma {
	private int numero1;
	private int numero2;

	Suma(int n1, int n2) {
		numero1 = n1;
		numero2 = n2;
	}

	void desplegar() {
		int suma;
		suma = numero1 + numero2;
		System.out.println(" PRIMER PROGRAMA REALIZADO EN JAVA ");
		System.out.println(" SUMATORIA DE DOS NUMEROS: " + suma);
	}
}