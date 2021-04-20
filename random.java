package proyecto;

import java.util.Random;
import java.util.StringTokenizer;
import java.util.Scanner;

public class random {
	public static void main(String[] args) {
		int num = 0;
		long num1=0;
		double num2=0;
		int par=0;
		int cont=0;
		Scanner scan1 = new Scanner(System.in);
		String frase = "";
		Random r =  new Random();
		for (int i =0;i<=10;++i) {
		do {
			num=r.nextInt();
		}while(num<0);
		System.out.println(num);
		}
		System.out.println("");
		for (int i =0;i<=10;++i) {
			num=r.nextInt(11)*-1;
			System.out.println(num);
		}
		System.out.println("");
		for (int i =0;i<=10;++i) {
			num1=r.nextLong();
			System.out.println(num1);
		}
		System.out.println("");
		for (int i =0;i<=10;++i) {
			num2=r.nextDouble()*100;
			System.out.println(num2);
		}
		System.out.println("");
		par =  r.nextInt(11);
		if (par % 2 ==0) {
			System.out.println("Numero Par");
		}
		else {
			System.out.println("Numero Impar");
		}
		
		/*
		 Math.ceil redondeo a la alza
		 Math.floor truncamiento, redondeo a baja
		 Math.round  redonde segun decimal
		 Math.min (num1,num2) el minimo de dos numero
		 Math.max (num1,num2) el maximo de dos numero
		 Math.pow (num1,elevacion) eleva un numero a x
		 Math.sqrt (num) raiz cuadrada de un numero
		 Math.random() numero aleatorio como random float
		 Math.PI llama al numero pi 3.1416
		  
		 */
		
		System.out.println("introduce una frase");
		frase=scan1.nextLine();
		StringTokenizer stt1 =  new StringTokenizer(frase);
		num=stt1.countTokens(); //cuento cada palabra
		scan1.close();
		String aux = "";
		while(stt1.hasMoreTokens()) {
			aux=stt1.nextToken();
			if (aux.equalsIgnoreCase("y")||aux.equalsIgnoreCase("e")||aux.equalsIgnoreCase("ni")) {
				cont++;
			}
		}
		System.out.println(cont);
		
		stt1 =  new StringTokenizer(frase);
		num = stt1.countTokens();
		cont=0;
		for(int i =1;i<=num;++i) {
			aux=stt1.nextToken();
			if (aux.equalsIgnoreCase("y")||aux.equalsIgnoreCase("e")||aux.equalsIgnoreCase("ni")) {
				cont++;
			}
		}
		System.out.println(cont);
		
	}

}
