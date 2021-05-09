import java.util.Scanner;

class CuadradoCubo {
	private double[] numeros;
	private double total = 0;

	public CuadradoCubo() {
		System.out.println("---CuadradoCubo---");
	}

	public void cuadradoCubo() {
		double cuadrado;
		double cubo;
		for (int i = 1; i <= 25; i++) {
			cuadrado = i * i;
			cubo = i * i * i;
			System.out.println(i + "^2: " + cuadrado + " - " + i + "^3: " + cubo);
		}
	}

}

public class Prog05CuadradoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuadradoCubo cuadradoCubo = new CuadradoCubo();
		cuadradoCubo.cuadradoCubo();
	}

}
