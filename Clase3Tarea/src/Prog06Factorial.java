import java.util.Scanner;

class Factorial {
	private int numero;

	public Factorial() {
		System.out.println("---Factorial---");
	}

	public void leerValor() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una numero: ");
		this.numero = scanner.nextInt();
	}

	public void factorial() {
		int factorial = 1;
		for (int i = numero; i > 1; i--) {
			factorial = i * factorial;
		}
		System.out.println("FACTORIAL: " + factorial);
	}
}

public class Prog06Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		factorial.leerValor();
		factorial.factorial();
	}

}
