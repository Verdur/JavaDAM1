package proyecto;

import java.util.Scanner;
enum diasSemana {
	LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
}
public class clasesEnumeradas {
	public static void main(String[] args) {
		/*diasSemana dia = diasSemana.LUNES;
		diasSemana dia1 = diasSemana.MARTES;
		System.out.println(dia.toString());
		System.out.println(dia.name());
		System.out.println(dia);
		
		System.out.println(dia.ordinal());
		
		diasSemana [] array = diasSemana.values();
		 System.out.println(dia.compareTo(dia1));
		 */
		diasSemana [] array = diasSemana.values();
		String input = "";
		short i = 0;
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Introduce un dia de la semana");
		do {
			input = sc.nextLine();
			i=0;
			do {
				if (input.equalsIgnoreCase(array[i].toString())) {
					flag=true;
					System.out.println(input.equalsIgnoreCase(array[i].toString()));
				}else {
					++i;
				}
			}while(i < array.length && flag != true);
		}while(flag == false);
		/*do {
			input = sc.nextLine();
			switch(input)
			{
			   case input == dia.equals(input) :
					   flag = true;
			   		   break;
			   case valor2 :
			      // Declaraciones
			      break; // break es opcional
			   
			   // Podemos tener cualquier número de declaraciones de casos o case
			   // debajo se encuentra la declaración predeterminada, que se usa cuando ninguno de los casos es verdadero.
			   // No se necesita descanso en el case default
			   default : 
			      // Declaraciones
			}
		}while(flag == false);
		*/
	}
}
