package proyecto;

import java.util.Scanner;

public class cadenas {
	static final int INDICE = 0;
	public static void main(String[] args) {
		
		String cadena = "";
		int end=0;
		Scanner scan1 =  new Scanner(System.in);
		System.out.println("Introduce una cadena");
		cadena=scan1.nextLine();
		end=cadena.length() -1;
		System.out.println("El primer caracter de la cadena es "+ cadena.charAt(INDICE) + " y el ultimo " + cadena.charAt(end) );
		
		scan1.close();
		
	}
}
