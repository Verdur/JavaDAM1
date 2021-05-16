package proyecto;

import java.util.Scanner;
import java.util.Random;

public class suerteExamenes {
	public static void main(String[] args) {
		 String[] names = {
		            "Liam",
		            "Olivia",
		            "Noah",
		            "Emma",
		            "Oliver",
		            "Ava",
		            "William",
		            "Sophia",
		            "Elijah",
		            "Isabella",
		            "James",
		            "Charlotte",
		            "Benjamin",
		            "Amelia",
		            "Lucas",
		            "Mia",
		            "Mason",
		            "Harper",
		            "Ethan",
		            "Evelyn",
		            "Denis", 
		            "Cyprian", 
		            "Ben", 
		            "Albert"
		        };
		 String nombre="";
		 int veces = 0;
		 Random rnd = new Random();
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Introduce el nombre de la persona a la que desear suerte");
		 nombre=sc.nextLine();
		 System.out.println("Introduce la cantidad de personas que le desearan suerte");
		 veces=Integer.parseInt(sc.nextLine());
		 for (int i = 1;i<=veces;++i) {
			 System.out.println(nombre+" Muchisima suerte en tus examenes Att: "+names[rnd.nextInt(names.length)]);
		 }
		 
		 sc.close();
		 
		 
	}
}
