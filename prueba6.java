package proyecto;

import java.util.Scanner;

public class prueba6 {
	
	public static void main(String[] args) {
		
		int num1=0, num2=0, num3=0;
		
		Scanner scan1 = new Scanner(System.in);
		
		num1=scan1.nextInt();
		num2=scan1.nextInt();
		num3=scan1.nextInt();
		
		System.out.println("La multiplicacion de los tres numero es igual a "+(num1*num2*num3));
		
		scan1.close();
	}
	

}
