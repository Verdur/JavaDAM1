package proyecto;

import java.util.Scanner;

public class aceptaelreto_413 {
	public static void main(String[] args) {
		
		int casos=0,ancho=0,alto=0,total=0;
		int blancas=0,negras=0;
		Scanner scan1 =  new Scanner(System.in);
		
		System.out.println("Introduce el numero de casos de prueba");
		casos=scan1.nextInt();
		
		for(int i=1;i<=casos;++i) {
			total=0;
			System.out.println("Introduce el alto");
			alto=scan1.nextInt();
			System.out.println("Introduce el ancho");
			ancho=scan1.nextInt();
			total=ancho*alto;
			if(total % 2 !=0) {
				blancas=total/2 +1;
				negras= total/2;
			}else {
				blancas=total/2;
				negras=total/2;
			}
			System.out.println("El total de casillas blancas fue "+blancas);
			System.out.println("El total de casillas negra fue "+negras);
		}
		scan1.close();
		
	}
}
