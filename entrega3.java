package proyecto;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class entrega3 {
	public static void main(String[] args) {
		Scanner scan1= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		ArrayList<Integer> interes = new ArrayList<Integer>();
		short anos=0;
		int  interes1 = 0, capital = 0, mat[][],i=0,f=0;
		System.out.println("Introduce el capital inicial");
		capital=scan1.nextInt();
		System.out.println("Introduce los tipos de interes 0 para acabar");
		do {
			interes1=scan1.nextInt();
			interes.add(interes1);
		}while(interes1 != 0);
		
		System.out.println("Introduce la cantidad de años que durara");
		anos=scan2.nextShort();
		scan2.close();
		mat = new int [anos+1] [interes.size()-1];
		System.out.println(interes.size());
		for (i=0;i<mat.length;++i) {
 			Arrays.fill(mat[i],0);
 			
 		}
		
		for(i=0;i<interes.size()-1;++i) {
			mat[0][i]=interes.get(i);
			mat[1][i]=capital;
		}
		
		for(i=2;i<mat.length;++i) {
			for(f=0;f<mat[i].length;++f) {
				if(i==2) {
					mat[i][f]= capital + ((capital * mat[0][f])/100) ;
				}
				else {
					mat[i][f]= mat[i-1][f] + ((mat[i-1][f] * mat[0][f])/100) ;
				}
			}
		}
		
		for (i=0;i<mat.length;++i) {
			for(f=0;f<mat[i].length;++f) {
	 			System.out.print(mat[i][f]+" ");
			}
			System.out.println("");
 		}
		
		scan1.close();
	}
}
