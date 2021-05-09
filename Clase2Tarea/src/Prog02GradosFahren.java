import java.util.*;

class CalcularGradosCToF {
	double gradosC, gradosF;

	CalcularGradosCToF() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce los grados en Centígrados:");
		gradosC = scanner.nextDouble();
	}

	void calcular() {
		gradosF = 32 + (9 * gradosC / 5);
		System.out.println(gradosC + " ºC = " + gradosF + " ºF");
	}

}

public class Prog02GradosFahren {

	public static void main(String[] args) {
		CalcularGradosCToF fh = new CalcularGradosCToF();
		fh.calcular();
	}

}
