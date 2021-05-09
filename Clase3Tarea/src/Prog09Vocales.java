import java.util.Scanner;

class Vocales {
	private int A = 0, E = 0, I = 0, O = 0, U = 0;
	private String texto;

	public Vocales() {
		System.out.println("---Vocales---");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una frase a validar:");
		texto = entrada.nextLine();
	}

	public void validarCadena() {
		for (int i = 0; i < texto.length(); i++) {
			switch (Character.toUpperCase(texto.charAt(i))) {
			case 'A':
				A++;
				break;
			case 'E':
				E++;
				break;
			case 'I':
				I++;
				break;
			case 'O':
				O++;
				break;
			case 'U':
				U++;
				break;
			default:
				break;
			}
		}
		System.out.println("Vocal A aparece: " + A);
		System.out.println("Vocal E aparece: " + E);
		System.out.println("Vocal I aparece: " + I);
		System.out.println("Vocal O aparece: " + O);
		System.out.println("Vocal U aparece: " + U);
	}

}

public class Prog09Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vocales vocales = new Vocales();
		vocales.validarCadena();
	}

}
