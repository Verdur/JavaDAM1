package proyecto;

import java.util.Scanner;

public class Peticiones {

	public static void main(String[] args) {
		String prueba ="";
		prueba=pedirString(prueba);
		System.out.println(prueba);
	}
	static String pedirString(String peticion ) {
		Scanner ask = new Scanner(System.in);
		peticion=ask.nextLine();
		ask.close();
		return peticion;
	}
	
	static int pedirInt(int peticion ) {
		Scanner ask = new Scanner(System.in);
		peticion=ask.nextInt();
		ask.close();
		return peticion;
	}
}
