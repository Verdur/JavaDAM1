package proyecto;

import java.util.Date;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class cadena2 {
	public static void main(String[] args) { //throws exception esto va dentras del args
		String cadena = "En mi proxima vida me reencarnare en Groucho Marx";
		System.out.println(cadena.length());
		System.out.println(cadena.charAt(7));
		System.out.println(cadena.indexOf('x'));
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.substring(0, 10));
		System.out.println(cadena.substring(cadena.length()-6));
		System.out.println(cadena.lastIndexOf('x'));
		System.out.println(cadena.replace("Groucho" , "los hermanos")+ " , a ser posible en el mudo de los hermanos");
		
		String cadena1="pEPE",cadena2="pePE";
		if (cadena1.toUpperCase().compareTo(cadena2.toUpperCase())==0) 
			System.out.println ("Iguales");
		else
			System.out.println("Diferentes");
		System.out.printf("%,+d%8.5f \n",100000,Math.PI);
		System.out.printf("%1$tT %1$tr",new Date());
		
	}
	
}
