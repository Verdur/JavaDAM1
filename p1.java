package proyecto;
import java.util.Scanner;

public class p1 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0, num2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=sc.nextInt();
		System.out.println("La suma de los numero introducidos es igual a " + (num1+num2));
		
		sc.close();
		
		
		//return 0;

	}
}
