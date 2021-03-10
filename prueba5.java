package proyecto;

import java.util.Scanner;

public class prueba5 {
	
	public static void main(String[] args) {
		
		int tarjeta1=0,tarjeta2=0,tarjeta3=0,tarjeta4=0,tarjeta5=0;
		Scanner scan1 =  new Scanner(System.in);
		
		System.out.println("Introduce un numero de tarjeta");
		tarjeta1=scan1.nextInt();
		System.out.println("Introduce un numero de tarjeta");
		tarjeta2=scan1.nextInt();
		System.out.println("Introduce un numero de tarjeta");
		tarjeta3=scan1.nextInt();
		System.out.println("Introduce un numero de tarjeta");
		tarjeta4=scan1.nextInt();
		System.out.println("Introduce un numero de tarjeta");
		tarjeta5=scan1.nextInt();
		
		System.out.println("Las tarjetas en orden de introduccion es el siguiente "+ tarjeta1 + ' ' + tarjeta2 + ' ' + tarjeta3 + ' ' + tarjeta4 + ' ' + tarjeta5);
		
		System.out.println("Las tarjetas en orden de introduccion  inverso es el siguiente "+ tarjeta5 + ' ' + tarjeta4 + ' ' + tarjeta3 + ' ' + tarjeta2 + ' ' + tarjeta1);
		scan1.close();
	}

}
