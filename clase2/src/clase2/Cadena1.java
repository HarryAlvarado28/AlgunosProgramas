package clase2;

class XCadena1 {
	private String str;

	XCadena1() {
		str = "Desarrollo de Software II";
	}

	void valida() {
		System.out.println("La cadena completa es: " + str);
		System.out.println("Esta cadena contiene " + str.length() + " caracteres");
		System.out.println("El caracter en la posicion 4 es " + str.charAt(4));
		System.out.println("La posicion del caracter w es " + str.indexOf('w'));
		System.out.println("La subcadena desde la posicion 3: " + str.substring(3));
		System.out.println("La subcadena es: " + str.substring(3, 10));
		System.out.print("Valor de retorno :" + str.startsWith("Desa"));
		System.out.print("Valor de retorno :" + str.endsWith("II"));
		String strTrim = " Desarrollo de Software II ";
		System.out.println("Uso de Trim " + strTrim.trim());
		System.out.println("La subcadena en MAYUSCULA: " + str.toUpperCase());
		System.out.println("La subcadena en minuscula: " + str.toLowerCase());
		System.out.println("Nuevo cadena :" + str.replace('I', '2'));
		String str1 = "Software II";
		String str2 = new String("Software II");
		if (str1.equals(str2)) {
			System.out.println("El mismo contenido");
		} else {
			System.out.println("Distinto contenido");
		}
	}
}

public class Cadena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XCadena1 cad = new XCadena1();
		cad.valida();
	}

}
