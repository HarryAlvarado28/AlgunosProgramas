
import java.util.Scanner;

class Salario {
	float salario, deducciones, horas_trabajadas, thora;
	String empleado = "";

	Salario() {
		Scanner scanner = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del empleado:");
		empleado = teclado.nextLine();
		System.out.println("Introduce horas trabajadas: ");
		horas_trabajadas = scanner.nextFloat();
		System.out.println("Introduce Tarifa por Hora $:");
		thora = scanner.nextFloat();
		System.out.println("Introduce deducciones $:");
		deducciones = scanner.nextFloat();
	}

	void calcular() {
		salario = (thora * horas_trabajadas) - deducciones;
		System.out.println("El Salario del empleado " + empleado + " es $" + salario);
	}

}

public class Prog03CalcularSalario {

	public static void main(String[] args) {

		Salario sc = new Salario();
		sc.calcular();

	}

}