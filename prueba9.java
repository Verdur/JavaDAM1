package proyecto;

import java.util.Scanner;

public class prueba9 {
	static final int PLUSH = 50;
	static final int PLUSF = 100;
	public static void main(String[] args) {
		
		Scanner sc1 =  new Scanner(System.in);
		Scanner sc2 =  new Scanner(System.in);
		String nombre ="";
		int mensual=0, hijos=0, familiar=0,total=0,final1=0,toth=0,totf=0;
		System.out.println("Introduzca su nombre");
		nombre=sc1.nextLine();
		System.out.println("Introduzca su sueldo");
		mensual=sc2.nextInt();
		System.out.println("Introduzca hijos a su cargo");
		hijos=sc2.nextInt();
		System.out.println("Introduzca familiares a cargo");
		familiar=sc2.nextInt();
		total=mensual*12;
		
		System.out.println("El sueldo anual es igual a " + total);
		toth=(hijos*PLUSH)*12;
		totf=(familiar*PLUSF)*12;
		final1=total+toth+totf;
		System.out.println("El sueldo anual de "+ nombre +" con extras es igual a " + final1);
		sc1.close();
		sc2.close();
		
	}
}
