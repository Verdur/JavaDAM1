package proyecto;

import java.util.Scanner;

public class prueba3 {
	
	public static void main(String[] args) {
		
		int num1=0, num2=0, aux=0;
		
		Scanner scan1 =  new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		num1=scan1.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=scan1.nextInt();
		
		aux=num2;
		num2=num1;
		num1=aux;
		
		System.out.println("Los numeros en orden contrario al introducido es igual a "+num1+' '+num2);
		
		scan1.close();
		
	}

}
