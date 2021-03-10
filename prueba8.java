package proyecto;

import java.util.Scanner;

public class prueba8 {
	static final int TAM =10;
	public static void main(String[] args) {
		
		
		int i = 0;
		String cadenas[];
		cadenas= new String[TAM];
		for (i=0;i<TAM;++i) {
			cadenas[i]="";
		}
		@SuppressWarnings("resource")
		Scanner sc1= new Scanner(System.in);
		for (i=0;i<TAM;++i) {
			cadenas[i]=sc1.nextLine();
		}
		sc1.close();
		for(i=TAM-1;i>=0;--i) {
			System.out.println(cadenas[i]);
		}
		
	}
}
