import java.util.Scanner;

class LongitudCadena {
	private String cadena;

	public LongitudCadena() {
		System.out.println("---CadenasIguales---");
	}

	public void leerCadena() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese una cadena: ");
		this.cadena = scanner.next();
	}

	public void longitud() {
		if (cadena.length() < 5) {
			rellenar(cadena, cadena.length());
		} else {
			System.out.println("Su cadena es: " + cadena);
		}
	}

	public void rellenar(String texto, int longitud) {
		String x = "";
		for (int i = 0; i < (10 - longitud); i++) {
			x = "X" + x;
		}
		System.out.println("Su cadena es: " + texto + x);
	}

}

public class Prog03LongitudCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongitudCadena longitudCadena = new LongitudCadena();
		longitudCadena.leerCadena();
		longitudCadena.longitud();
	}

}
