import java.util.Scanner;

class Notas {
	private int i = 1, n = 0, NotasAprobadas = 0, NotasReprobadas = 0;
	private float cal = 0, PromedioTotal = 0, reprov = 0, aprov = 0, totaprov = 0, totreprov = 0;

	public Notas() {
		System.out.println("---Notas---");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de notas a ingresar:");
		n = entrada.nextInt();
		while (i <= n) {
			System.out.println("Ingrese nota #" + i);
			cal = entrada.nextInt();
			if (cal > 70) {
				NotasAprobadas = NotasAprobadas + 1;
				totaprov = totaprov + cal;

			} else {
				NotasReprobadas = NotasReprobadas + 1;
				totreprov = totreprov + cal;
			}
			i++;
			PromedioTotal = ((totaprov + totreprov) / n);
		}
	}

	public void NotasAprobadas() {
		System.out.println("El numero de notas aprobadas es: " + NotasAprobadas);
	}

	public void NotasReprobadas() {
		System.out.println("El numero de notas reprobadas es: " + NotasReprobadas);
	}

	public void PromedioNotasAprobadas() {
		System.out.println("El promedio de notas aprobadas es: " + totaprov / NotasAprobadas);
	}

	public void PromedioNotasReprobadas() {
		System.out.println("El promedio de notas reprobadas es: " + totreprov / NotasReprobadas);
	}

	public void PromedioTotal() {
		System.out.println("El promedio total de notas es: " + PromedioTotal);
	}

}

public class Prog07NotasEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas notas = new Notas();
		notas.NotasAprobadas();
		notas.NotasReprobadas();
		notas.PromedioNotasAprobadas();
		notas.PromedioNotasReprobadas();
		notas.PromedioTotal();
	}

}
