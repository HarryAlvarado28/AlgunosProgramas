class ObjectToString {
	private String obj1;
	private String obj2;
	private String obj3;

	ObjectToString(String a, String b, String c) {
		obj1 = a;
		obj2 = b;
		obj3 = c;
	}

	void desplegar() {
		System.out.println(toString());
	}

	public String toString() {
		return (obj1 + " " + obj2 + " " + obj3);
	}
}

class XObjectToString {
	public static void main(String args[]) {
		ObjectToString ts = new ObjectToString("Desarrollo", "de", "Software III");
		ts.desplegar();
	}
}