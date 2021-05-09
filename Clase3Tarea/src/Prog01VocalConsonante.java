import java.util.Scanner;

class Vocal {
	private String texto;

	Vocal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cualquier cadena: ");
		this.texto = scanner.next();
		EsVocal(texto);
	}

	private void EsVocal(String texto) {
		String letra;
		letra = texto.substring(0, 1).toLowerCase();
		switch (letra) {
		case "a": {
			EsUnaVocal();
			break;
		}
		case "e": {
			EsUnaVocal();
			break;
		}
		case "i": {
			EsUnaVocal();
			break;
		}
		case "o": {
			EsUnaVocal();
			break;
		}
		case "u": {
			EsUnaVocal();
			break;
		}
		default:
			System.out.println("El primer caracter es una CONSONANTE");
		}

	}

	private void EsUnaVocal() {
		System.out.println("El primer caracter es una VOCAL");
	}
}

public class Prog01VocalConsonante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vocal vocal = new Vocal();
	}

}
