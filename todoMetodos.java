package proyecto;

import java.util.Arrays;
import java.util.Scanner;


class arrays {
	 private String [] arr1 = new String [1];
	 private int [] arr2 = new int [1];
	 
	public String[] getArr1() {
		return arr1;
	}
	
	public void setArr1(String[] arr1) {
		this.arr1 = Arrays.copyOf(arr1, arr1.length);
	}
	
	public int[] getArr2() {
		return arr2;
	}
	
	public void setArr2(int[] arr2) {
		this.arr2 = Arrays.copyOf(arr2, arr2.length);
	}

	public arrays(String[] arr1, int[] arr2) {
		this.arr1 = Arrays.copyOf(arr1, arr1.length);
		this.arr2 = Arrays.copyOf(arr2, arr2.length);
	}

	public String toString() {
		return "arrays [arr1=" + Arrays.toString(arr1) + ", arr2=" + Arrays.toString(arr2) + "]";
	}
	 
	 
	
}
public class todoMetodos {
	public static void main(String[] args) {
		//trabajar con fechas, diferencais entre fechas y sacar mayoria de edad bien
		//Arrays y matrices, rellenar,sacar longitudes, etc
		//Ordenar arrays y buscar datos concretos
		//Ejemplo for each
		//ejemplos swtichs
		//metodos pedir datos por pantalla controlando excepciones
		//controlar index out of bonds en arrays
		//getter setters incluidos con arrays y el copy of para ver como funciona
		//ejemplos con private y public, metodos estaticos y no estaticos
		//clase Character
		Scanner sc =  new Scanner(System.in);
		int [] array = new int[1];
		String [] array2 = new String[1];
		char caracter = ' ';
		int [] [] matriz = new int [5] [4];
		array = aumentoArray(array);
		array2 = aumentoArray(array2);
		ordenArrays(array);
		//lecturaArray(array);
		//lecturaArray(array2);
		System.out.println("introduce un caracter");
		caracter = Character.toUpperCase(sc.nextLine().charAt(0));
		arrays obj1= new arrays(array2,array);
		System.out.println(obj1);
		iniMatriz(matriz);
		System.out.println(longMatriz(matriz));
		
	}
	
	
	
	//Aumentos de Array con sobrecarga para meter tanto cadena como int
	
	
	
	static int[] aumentoArray (int [] arr) {
		int num = 0;
		System.out.println("Introduce tantos numeros como desees, -1 para parar");
		Scanner sc =  new Scanner(System.in);
		num = Integer.parseInt(sc.nextLine());
		short i=1;
		while (num != -1) {
			arr = Arrays.copyOf(arr, i);
			arr[i-1]=num;
			++i;
			num = Integer.parseInt(sc.nextLine());
		}
		return arr;
	}
	
	static String[] aumentoArray (String [] arr) {
		String cadena = "";
		System.out.println("Introduce cadenas, cadena vacia para terminar");
		Scanner sc =  new Scanner(System.in);
		cadena = sc.nextLine();
		short i=1;
		while (cadena != "") {
			arr = Arrays.copyOf(arr, i);
			arr[i-1]=cadena;
			++i;
			cadena = sc.nextLine();
		}
		return arr;
	}
	
	
	
	
	//Leer Arrays con sobrecarga para poder leer tanto enteros como cadenas
	
	
	
	static void lecturaArray (int [] arr) {
		for (short i = 0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
		
	}
	
	static void lecturaArray (String [] arr) {
		for (short i = 0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
	}
	
	
	//Ordenar Arrays 
		static void ordenArrays(int [] arr) {
			Arrays.sort(arr);
		}

	//Longitud de una matriz y inicializar matriz
		
		static void iniMatriz  (int [] [] mat) {
			for (short i = 0;i<mat.length;++i) {
				Arrays.fill(mat[i], 0);
			}
		}
		
		static int longMatriz (int [] [] mat) {
			int longi = 0;
			for (short i = 0;i<mat.length;++i) {
				longi = longi + mat[i].length;
			}
			return longi;
		}
	
}

	


/*
 * static void AumentoArray (int [] arr) {
		int num = 0;
		boolean flag = false;
		System.out.println("Introduce tantos numeros como desees, cadena en blanco para parar");
		Scanner sc =  new Scanner(System.in);
		try {
		num = Integer.parseInt(sc.nextLine());
		short i=1;
			while (flag == false) {
				arr = Arrays.copyOf(arr, i);
				arr [i-1]=num;
				try {
					num = Integer.parseInt(sc.nextLine());
				}catch (Exception e) {
					System.out.println("Ha introducido la cadena vacia o un valor incorrecto, cerrado programa");
					flag = true;
				}
				++i;
				for (short f = 0;f<arr.length;++f) {
					System.out.println(arr[f]);
				}
			}
		}catch (Exception e) {
			System.out.println("Ha introducido la cadena vacia o un valor incorrecto, cerrado programa");
			flag = true;
		}
		
	}
 */
