package proyecto;

import java.util.Scanner;

public class aceptaelreto_191 {
	
	public static void main(String[] args) {
		
		int casos=0, i=0,f=0,compartimentos=0,capacidad=0,diferencia=0,suma=0;
		Scanner scan1 =  new Scanner(System.in);
		
		System.out.println("Introduce cuantos casos de prueba vamos a observar");
		casos=scan1.nextInt();
		for (i=1;i<=casos;++i) {
			System.out.println("Introduce el numero de compartimentos");
			compartimentos=scan1.nextInt();
			System.out.println("Introduce la capacidad de los tanques");
			capacidad=scan1.nextInt();
			System.out.println("Introduce separacion entre tanques");
			diferencia=scan1.nextInt();
			suma=0;
			for(f=1;f<=compartimentos;f++) {
				suma=capacidad+suma;
				capacidad=capacidad-diferencia;
			}
			System.out.println("Capacidad total="+suma);
			
		}
		scan1.close();
	}
}
