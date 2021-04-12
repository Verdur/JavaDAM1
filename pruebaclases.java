package proyecto;

import java.util.Scanner;

class perro{
	public String nombre;
	public int edad;
	public String raza;
}

public class pruebaclases {
	public static void main(String[] args) {
		Scanner scan1 =  new Scanner(System.in);
		perro per1= new perro();
		per1.nombre= scan1.nextLine();
		per1.raza=scan1.nextLine();
		System.out.println(per1.nombre);
		
		scan1.close();
	}
}
