package proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class arraysCopyOf {
	public static void main(String[] args) {
		String [] arr1;
		String input ="";
		int i = 0;
		Scanner sc =  new Scanner(System.in);
		/*
		arr1 = new String[5];
		Arrays.fill(arr1, "aa");
		for(int i = 0;i<arr1.length;++i) {
		System.out.println(arr1[i]);
		}
		arr1= Arrays.copyOf(arr1, 12);
		for(int i = 0;i<arr1.length;++i) {
			System.out.println(arr1[i]);
			}
			*/
		
		//Declaro un array de 1 posicion
		arr1 = new String[1];
		i=1;
		//creo un bucle do while para ir realizando la peticion de datos
		do {
			input=sc.nextLine();
			//aumento en 1 la cantidad del array
			arr1 = Arrays.copyOf(arr1, i);
			//introduzco en la posicion -1 ya que el array empieza en 0
			arr1[i-1] = input;
			//aumentamos la i para la siguiente interaccion 
			++i;
		}while(input!="");
		//lectura del array.i8
		for(i = 0;i<arr1.length;++i) {
			System.out.println(arr1[i]);
			}
	}
}
