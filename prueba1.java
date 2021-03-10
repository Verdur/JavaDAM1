package proyecto;

import java.util.Scanner;

public class prueba1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String apellidos="",nombre="";
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Introduce un nombre");
		nombre=scan1.nextLine();
		
		System.out.println("Introduce el apellido");
		apellidos=scan1.nextLine();
		System.out.println("Usted ha introducido "+ nombre + " "+ apellidos);
		
		scan1.close();
		//return 0;
	}
}
