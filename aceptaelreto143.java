package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class aceptaelreto143 {
	public static void main(String[] args) {
		int cantidad=0,i=0,tam=0,input=0,casos=0,sobras=0,f=0,input2=0,h=0;
		Scanner scan1= new Scanner(System.in);
		ArrayList<Integer> tortitas = new ArrayList<Integer>();
		ArrayList<Integer> tortitas2 = new ArrayList<Integer>();
		System.out.println("Introduce la cantidad de tortitas");
		cantidad=scan1.nextInt();
			while(cantidad>0) {
				tortitas.clear();
				tortitas2.clear();
				for(i=cantidad-1;i>=0;--i) {
					tortitas.add(cantidad--);
				}
				
			tam=tortitas.size();
			for (i=0;i<tam;++i) {
				System.out.print(tortitas.get(i)+" ");
			}
			System.out.println("Introduce la cantidad de vueltas y el numero de tortitas por vuelta");
			casos=scan1.nextInt();
			for(i=1;i<=casos;++i) {
				input=scan1.nextInt();
				input2=input;
				sobras=tortitas.size()-input;
				for(f=0;f<sobras;++f) {
					tortitas2.add(tortitas.get(input2));
					input2++;
				}
				tam=tortitas2.size();
				h=input-1;
				//asignar la vuelta
				for(f=tam;f<tortitas.size();++f) {
					tortitas2.add(tortitas.get(h--));
				}
				tam=tortitas.size();
				for (f=0;f<tam;++f) {
					tortitas.set(f, tortitas2.get(f));
				}
				tortitas2.clear();
		}
		System.out.println(tortitas.get(tortitas.size()-1));
		
		System.out.println("Introduce la cantidad de tortitas");
		cantidad=scan1.nextInt();
		}
		scan1.close();
	}	
}
