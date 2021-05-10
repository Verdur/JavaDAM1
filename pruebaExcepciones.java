package proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class pruebaExcepciones {
	public static void main(String[] args) throws Exception{
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			num = sc.nextInt();
		}catch (InputMismatchException e)
		{
			System.out.println("Error no ha introduduciod numero");
		}
			catch (Exception e){
		
			e.printStackTrace();
			System.out.println("Valor no aceptado");
			num=-1;
		}
		//controlar excepciones en la peticion y que nos siga pidiendo
		//un numero
		
		System.out.println(num);
	}
}
