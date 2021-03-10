package proyecto;

import java.util.Scanner;

public class prueba7 {
	static final int TAM = 10;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		int num = 0, i=0;
		int arraynum [];
		arraynum = new int[TAM];
		for (i=0;i<TAM;++i) {
			arraynum[i]=0;
		}
		
		for (i=0;i<TAM;++i) {
			arraynum[i]=sc.nextInt();
		}
		System.out.println("Introduce la poscion a igualar");
		num=sc.nextInt();
		System.out.println("La posicion contiene "+ arraynum[num]);
		sc.close();
	}

}
