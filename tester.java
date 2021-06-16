package proyecto;

import java.util.Scanner;

class vehiculo{
	private int ruedas;
	private int pasajeros;
	private String matricula;
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public vehiculo () {
		
	}
	public vehiculo(int ruedas, int pasajeros, String matricula) {
		this.ruedas = ruedas;
		this.pasajeros = pasajeros;
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "vehiculo [ruedas=" + ruedas + ", pasajeros=" + pasajeros + ", matricula=" + matricula + "]";
	}
	
}

public class tester {
	public static final int TAM = 5;
	public static void main(String[] args) {
		vehiculo [] objs = new vehiculo[TAM];
		for (short i = 0;i<objs.length;++i) {
			objs[i] = crear(new vehiculo());
		}
		lectura(objs);
	}
	static vehiculo crear (vehiculo obj) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce la matricula");
		obj.setMatricula(sc1.nextLine());
		System.out.println("Introduce los pasajeros");
		obj.setPasajeros(petPos(Integer.parseInt(sc1.nextLine())));
		System.out.println("Introduce la cantidad de ruedas");
		obj.setRuedas(petPos(Integer.parseInt(sc1.nextLine())));
		return obj;
	}
	static int petPos(int num) {
		Scanner sc1 = new Scanner(System.in);
		do {
		try {
			if (num<0) {
				throw new Exception ("Error numero negativo");
			}else {
				return num;
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("Introduce un numero positivo");
			num =  Integer.parseInt(sc1.nextLine());
		}
		}while(num<0);
		return num;
	}
	static void lectura (vehiculo [] objs1) {
		for (short i = 0;i<objs1.length;++i) {
			System.out.println(objs1[i]);
		}
	}
}
