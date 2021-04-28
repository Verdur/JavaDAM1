package proyecto;

import java.util.Scanner;
class primera{
	
	public static int getNum(int num) {
		Scanner scan1 = new Scanner(System.in);
		int pos=0,cifra=0;
		String prueba = "";
		//System.out.println("Introduce el numero");
		//num1=Integer.parseInt(scan1.nextLine());
		System.out.println("Introduce la posicion de retorno");
		pos=Integer.parseInt(scan1.nextLine())-1;
		prueba = String.valueOf(num);
		prueba=prueba.substring(pos,pos+1);
		pos=Integer.parseInt(prueba);
		return pos;
	}
	
	public static void parImp(int num) {
		if (num%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		
		return;
	}
}

class segunda{
	private int num = 0;
	boolean simetrico(){
		boolean flag = false;
		int cifra=0, inverso = 0,original=0;
		original=num;
        while(num!=0){
            cifra = num%10;
            inverso = (inverso * 10) + cifra;
            num/=10;
        }
		if (original==inverso) {
			flag=true;
		}
		else {
			flag=false;
		}
		return flag;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public segunda (int num1) {
		this.num=num1;
	}
	
	
}
public class menu_opciones {

		public static void main (String [] args) {
			int num = 0,opcion=0;
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Introduce un numero");
			num=Integer.parseInt(scan1.nextLine());
			System.out.println("Elige que opcion quieres 1 , 2 o 3");
			do {
			opcion=Integer.parseInt(scan1.nextLine());
			}while(opcion!=1 && opcion!=2 && opcion!=3);
			if(opcion==1) {
				System.out.println(primera.getNum(num));
			}else {
				if(opcion==2) {
					segunda num1 =  new segunda(num);
					System.out.println(num1.simetrico());
				}
				else {
					primera.parImp(num);
				}
			}
			
			 
			
		}
}
