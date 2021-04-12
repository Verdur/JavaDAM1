package proyecto;


import java.util.Arrays;
import java.util.Scanner;

public class pruebas {
	static final int TAM = 3;
	public static void main(String[] args) {
		int mat [] [], i=0,f=0,tam=0;
		mat = new int [TAM] [];
		Scanner scan1= new Scanner(System.in);
		
		System.out.println("Tamano primera fila");
		tam=scan1.nextInt();
		mat [0] =  new int[tam];
		System.out.println("Tamano segunda fila");
		tam=scan1.nextInt();
		mat [1] = new int [tam];
		System.out.println("Tamano tercera fila");
		tam=scan1.nextInt();
 		mat [2] = new int [tam];
 		
 		
 		for (i=0;i<mat.length;++i) {
 			Arrays.fill(mat[i],0);
 		}
 		
 		for (i=0;i<mat.length;++i) {
 			for(f=0;f<mat[i].length;++f) {
 				mat[i][f]=scan1.nextInt();
 			}
 			
 		}
 		
 		for (i=0;i<mat.length;++i) {
 			for(f=0;f<mat[i].length;++f) {
 				System.out.println(mat[i][f]);
 			}
 			
 		}
		
		
		scan1.close();
	}
}
