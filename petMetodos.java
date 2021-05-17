package proyecto;

import java.util.Scanner;

public class petMetodos {
	public static int petNum() {
		int num = 0;
		System.out.println("Introduce el numero ");
		boolean flag =false;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				num=Integer.parseInt(sc.nextLine());
				/*if (num<0) {
					try {
						throw new Exception("Num negativo");
					}catch (Exception e){
						System.out.println("Error Numero Negativo");
					}
				}else {
					if(num==0) {
						try {
							throw new Exception("Num nulo");
						}catch (Exception e){
						System.out.println("Error Numero nulo");
					}
				}
				}*/
				flag=true;
			}catch(Exception e) {
				System.out.println("Error - Valor no numerico");
			}
			
		}while (flag!=true ); //|| num<0 || num==0
		
		
		
		
		return num;
	}
	public static int formato1 (int num) {
		boolean flag =false;
		do {
		try {
			if (num == 0) {
				throw new Exception("Num nulo");
			}else {
				if(num < 0) {
					throw new Exception("Num negativo");
				}
			}
			flag=true;
		}
		catch (Exception e){
			System.out.println(e);
			num=petNum();
		}
		}while(flag ==false);
		return num;
	}
}