package proyecto;

import java.util.Scanner;

public class prueba4 {
	
	public static void main(String[] args) {
		
		String nombre ="", apellidos="";
		int edad=0, telefono=0;
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner (System.in);
		
		System.out.println("Introduzca un nombre");
		nombre=scan1.nextLine();
		System.out.println("Introduzca un apellido");
		apellidos=scan1.nextLine();
		System.out.println("Introduzca la edad");
		edad=scan2.nextInt();
		System.out.println("Introduzca el telefono");
		telefono=scan2.nextInt();
		
		System.out.println("Los datos introducidos son los siguientes\nNombre: "+ nombre + "\napellidos: " + apellidos + "\nedad: "+edad+"\nnumero de telefono =  " +telefono);
		
		scan1.close();
		scan2.close();
	}
}
