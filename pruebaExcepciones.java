package proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class pruebaExcepciones {
	public static void main(String[] args) throws Exception{
		int num = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		/*
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
		*/
		/*
		num=0;
		do {
		try {
			num=Integer.parseInt(sc.nextLine());
			if(num == 0) {
				throw new ArithmeticException("Numero nulo");
			}else {
				if (num < 0) {
					throw new Exception("Num negativo");
				}
			}
			flag = true;
		}catch (NumberFormatException e){
			System.out.println("Error - Usted no ha introducido un numero");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Numero nulo");
		}
		catch (Exception e) {
			System.out.println("Num negativo");
		}
		
		
		}while(flag==false);
		System.out.println(num);
		*/
		

		num = petMetodos.formato1(petMetodos.petNum());
		System.out.println(num);
	}
}