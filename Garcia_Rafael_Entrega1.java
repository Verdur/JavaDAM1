package proyecto;
import java.util.Scanner;
public class argumentos {
	public static void main(String[] args) {
		String valor1;
		Scanner scan1= new Scanner(System.in);
		do {
		valor1=scan1.next();
		}while(valor1.length()>1);
		char1(valor1.charAt(0));
		scan1.close();
		
	}
	public static void char1(char args1) {
		boolean flag1=false;
		flag1=false;
		boolean flag2=false;
		flag2=false;
		if (args1 == 'A' || args1=='E' || args1=='I' || args1 == 'O' || args1=='U' ) {
			System.out.println("Ha introducido una vocal mayuscula");
			flag1=true;
		}
		else {
			if (args1 == 'a' || args1=='e' || args1=='i' || args1 == 'o' || args1=='u' ) {
			System.out.println("Ha introducido una vocal minuscula");
			flag1=true;
			}
			else {
				if(args1 >= '0' && args1 <='9') {
					flag2=true;
					switch (args1) {
						case ('0'): System.out.println("Cero");
							break;
						case ('1'): System.out.println("Uno");
							break;
					}
				}
			}
		}
		if (flag1==true) {
			args1= Character.toUpperCase(args1);
			if(args1>='A' && args1<='J') {
				System.out.println("Rango entre A y J");
			}
			else {
				if(args1>='K' && args1<='R') {
					System.out.println("Rango entre K y R");
				}else {
					if(args1>='S' && args1<='Z') {
						System.out.println("Rango entre S y Z");
					}
				}
			}
		}
		else {
			if (flag2==false)
				System.out.println("Caracter no contemplado");
		}
	}
}


/*switch (args1) {
case ( 'A' || 'E' || 'I' || 'O' ||'U'):
	System.out.println("Ha introducido una vocal mayuscula");
	break;
case
}*/