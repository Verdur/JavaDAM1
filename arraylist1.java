package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
	public static void main(String[] args) {
		int i = 0,tam=0,pos=0;
		String input = "";
		boolean flag= false;
		Scanner scan1= new Scanner(System.in);
		Scanner scan2= new Scanner(System.in);
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Morado");
		tam=colores.size();
		for (i=0;i<tam;++i) {
			System.out.println(colores.get(i));
		}
		System.out.println("Introduce un nuevo color");
		input=scan1.nextLine();
		colores.set(0, input);
		System.out.println("Nueva lista de colores");
		for (i=0;i<tam;++i) {
			System.out.println(colores.get(i));
		}
		System.out.println("Elige una posicion existente para leer");
		pos=scan2.nextInt();
		System.out.println("La posicion elegida contiene " + colores.get(pos));
		System.out.println("¿Quiere eliminar el 3 elemento de la Array List?");
		input=scan1.nextLine();
		flag=false;
		if (input.equals("Si") || input.equals("si")) {
			flag=true;
		}
		if (flag==true) {
			colores.remove(2);
		}
		tam=colores.size();
		for (i=0;i<tam;++i) {
			System.out.println(colores.get(i));
		}
		System.out.println("Escribe un color para buscar en el ArrayList");
		input=scan1.nextLine();
		tam=colores.size();
		flag=false;
		i=0;
		do{
			if(input.equals(colores.get(i))) {
				flag=true;
			}
			++i;
		}while(flag==false && i<tam);
		if (flag==true) {
			System.out.println("El color se encuentra en el array");
		}else {
			System.out.println("El color no se encuentra en el array");
		}
		ArrayList<String> colores2 = new ArrayList<String>();
		tam=colores.size();
		for (i=0;i<tam;++i) {
			colores2.add(i, colores.get(i));
		}
		tam=colores2.size();
		for (i=0;i<tam;++i) {
			System.out.println(colores2.get(i));
		}
		scan1.close();
		scan2.close();
	}
}
