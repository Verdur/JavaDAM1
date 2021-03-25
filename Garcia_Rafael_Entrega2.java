package proyecto;

import java.util.Scanner;
public class entregafer2 {
	public static void main(String[] args) {
		int edad = 0, max=0,min=0,media=0,cont=0;
		String cond = "";
		boolean parar=false,simax=false,simin=false;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		max=0;
		min=111;
		cont=0;
		do {
			do{
				System.out.println("Introduce una edad");
				edad=sc.nextInt();
			}while(edad<1 || edad >110);
			++cont;
			System.out.println(cont);
			if (edad<min)
				min=edad;
			
			if(max<edad)
				max=edad;
		
			media = media + edad;
			if (edad==110 && simax==false)
				simax=true;
			else {
				if(edad==1 && simin==false)
					simin=true;
			}
			System.out.println("¿Quiere continuar?");
			cond=sc1.nextLine();
			if (cond.equals("No") || cond.equals("no"))
				parar=true;
		}while(parar!=true);
		sc.close();
		sc1.close();
		media = media / cont;
		System.out.println("Edad minima = "+ min);
		System.out.println("Edad maxima = "+ max);
		System.out.println("Edad media = "+ media);
		if(simax==true)
			System.out.println("Aparecio el numero maximo");
		else
			System.out.println("No aparecio el numero maximo");
		if(simin==true)
			System.out.println("Aparecio el numero minimo");
		else
			System.out.println("No aparecio el numero minimo");
	}
}
