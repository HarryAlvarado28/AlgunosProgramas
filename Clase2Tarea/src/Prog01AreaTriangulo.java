
import java.util.Scanner;

class AreaTrian {
	double b, h;
	double area;

	AreaTrian() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa BASE: ");
		b = scanner.nextDouble();
		System.out.println("Ingresa ALTURA: ");
		h = scanner.nextDouble();
	}

	void calcular() {
		area = b * h / 2;
		System.out.print("El Area del Triangulo es: " + area);
	}
}

public class Prog01AreaTriangulo {
	public static void main(String[] args) {
		AreaTrian area = new AreaTrian();
		area.calcular();
	}
}
