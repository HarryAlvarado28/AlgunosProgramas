class ObjectEquals {
	private String str1;
	private String str2;

	ObjectEquals(String st1, String st2) {
		str1 = st1;
		str2 = st2;
	}

	boolean comparar() {
		if (str1.equals(str2)) {
			return true;
		} else {
			return false;
		}
	}
}

class XObjectEquals {
	public static void main(String args[]) {
		ObjectEquals oe = new ObjectEquals("Sistemas", "Sistemas");
		if (oe.comparar()) {
			System.out.println("Cadenas Iguales");
		} else {
			System.out.println("Cadenas No son Iguales");
		}
	}
}