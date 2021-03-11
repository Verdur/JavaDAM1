package proyecto;

import java.util.Scanner;

public class aceptaelreto_313 {

	public static void main(String[] args) {
		
		int casos=0,i=0,ingresos=0,gastos=0;
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Introduce el numero de casos de prueba");
		casos=sc.nextInt();
		for (i=1;i<=casos;++i) {
			ingresos=sc.nextInt();
			gastos=sc.nextInt();
			if (ingresos + gastos < 0)
				System.out.println("NO");
			else
				System.out.println("SI");
		}
		sc.close();
	}
}
