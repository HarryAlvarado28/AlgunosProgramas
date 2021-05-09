package clase2;

import java.io.*;

class XEntrada {
	String nombre;
	int edad;
	double saldo;

	void leer_cadena() {
		try {
			InputStreamReader lector = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(lector);
			System.out.println("Escribe tu nombre: ");
			nombre = br.readLine();
		} catch (IOException e) {
			System.out.println("Error de Lectura");
		}
	}

	void leer_entero() {
		try {
			String cad;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribe tu edad: ");
			cad = br.readLine();
			edad = Integer.parseInt(cad);
		} catch (IOException e) {
			System.out.println("Error de Lectura");
		}
	}

	void leer_doble() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Escribe tu deposito: ");
			saldo = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			System.out.println("Error de Lectura");
		}
	}

	void imprimir() {
		System.out.println("Hola, " + nombre + " tu edad es: " + edad + " y tu Deposito fue : " + saldo);
	}
}

public class EntradaDatos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XEntrada ent = new XEntrada();
		ent.leer_cadena();
		ent.leer_entero();
		ent.leer_doble();
		ent.imprimir();
	}

}
