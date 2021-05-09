import java.util.Scanner;

class Fibonacci {
	int cantidad, valor, predecesor = 0, posterior = 1;

	public Fibonacci() {
		System.out.println("---Fibonacci---");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros a generar: ");
		cantidad = entrada.nextInt();
	}

	public void generaSerie() {
		System.out.print(predecesor + "\t" + posterior);
		for (int x = 3; x <= cantidad; x++) {
			valor = predecesor + posterior;
			predecesor = posterior;
			posterior = valor;
			System.out.print("\t" + valor);
		}
	}

}

public class Prog10Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.generaSerie();
	}

}
