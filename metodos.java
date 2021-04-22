package proyecto;

import java.util.Scanner;

public class metodos {
	public static void main(String[] args) {
		Scanner scan1= new Scanner(System.in);
		int ano=0;
		System.out.println("Introduce un año");
		ano=scan1.nextInt();
		if (bis(ano)) {
			System.out.println("Es bisisesto");
		}else 
			System.out.println("No es bisiesto");
		bis1(ano);
		scan1.close();
	}
	static boolean bis(int ano) {
		boolean flag=false;
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
			flag=true;
		}else
			flag=false;
		
		return flag;
	}
	static void bis1(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
			System.out.println("Bisiesto2");
		}else
			System.out.println("No Bisiesto");
		
		return;
	}
}
