import java.io.IOException;
import java.util.Scanner;

class Numeros50 {
	private int numero;

	public Numeros50() {
		System.out.println("---Numeros50---");
	}

	public void determinarValor() throws IOException {
		Scanner scanner = new Scanner(System.in);
		char respuesta;
		do {
			System.out.print("Introduce un número: ");
			numero = scanner.nextInt();
			if (numero != 0) {
				if (numero > 0) {
					System.out.print(" Positivo ");
				} else {
					System.out.print(" Negativo ");
				}
				if (numero % 2 == 0) {
					System.out.println(" Par ");
				} else {
					System.out.println(" Impar ");
				}
			}
			System.out.print("Desea introducir más números? (S/N): ");
			respuesta = (char) System.in.read();
		} while (respuesta != 'N' && respuesta != 'n');
		System.out.print("---FIN----");
	}

}

public class Prog08Numeros50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeros50 numeros = new Numeros50();
		try {
			numeros.determinarValor();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
