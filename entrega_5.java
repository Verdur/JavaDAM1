package proyecto;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

class persona{
	private static final char DEFAULTSEXO = 'M';
	public final short minIMC = 20;
	public final short maxIMC = 25;
	private int id;
	private String nombre;
	private GregorianCalendar fecha_nacimiento = new GregorianCalendar();
	private	char sexo;
	private float altura;
	private float peso;
	private String [] aficiones = new String[5];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public GregorianCalendar getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(GregorianCalendar fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String[] getAficiones() {
		return aficiones;
	}
	public void setAficiones(String[] aficiones) {
		System.arraycopy(aficiones, 0, this.aficiones,0,this.aficiones.length);
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	persona (){
		this.sexo=DEFAULTSEXO;
	}
	public persona(String nombre, GregorianCalendar fecha_nacimiento, char sexo) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
	}
	
	public persona(String nombre, GregorianCalendar fecha_nacimiento, char sexo, float altura, float peso,
			String[] aficiones) {
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.aficiones = aficiones;
	}
	
	public String toString() {
		return "persona [id=" + id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento.getTime() + ", sexo=" + sexo
				+ ", altura=" + altura + ", peso=" + peso + ", aficiones=" + Arrays.toString(aficiones) + "]";
	}
	public short calculoImc() {
		short imc=0;
		int calc = (int) (peso/(altura/2));
		String icn = Integer.toString(Math.round(calc));
		short calcImc = Short.parseShort(icn) ;
		if (calcImc<minIMC) {
			imc=-1;
		}else {
			if(calcImc>=minIMC && calcImc<=maxIMC) {
				imc=0;
			}else
				imc=1;
		}
		return imc;
	}
	
	public boolean esMayorDeEdad() {
		boolean flag = false;
		GregorianCalendar fecha_actual = new GregorianCalendar();
		if (fecha_actual.get(GregorianCalendar.YEAR)-fecha_nacimiento.get(GregorianCalendar.YEAR) >= 18) {
			if (fecha_actual.get(GregorianCalendar.YEAR)-fecha_nacimiento.get(GregorianCalendar.YEAR) == 18 && fecha_nacimiento.get(GregorianCalendar.MONTH)>fecha_actual.get(GregorianCalendar.MONTH) || fecha_nacimiento.get(GregorianCalendar.MONTH)==fecha_actual.get(GregorianCalendar.MONTH) && fecha_nacimiento.get(GregorianCalendar.DATE)>fecha_actual.get(GregorianCalendar.DATE)) {
				flag=false;
			}else {
			flag = true;
			}
		}
		return flag;
	}
	
	public void comprobarSexo(char sexo) {
		if(sexo!='H' || sexo!=DEFAULTSEXO) {
			this.sexo = DEFAULTSEXO;
		}else
			this.sexo=sexo;
	}
	
	public void generarIdentificador() {
		Random r = new Random();
		int newID = 100000 + r.nextInt(900000);
		this.id = newID;
	}
	
}

class Estatico {
	static String mensajePeso(persona objeto) {
		String mensaje = "";
		if (objeto.calculoImc()==-1) {
			mensaje="Se encuentra por debajo de su peso ideal";
		}else {
			if (objeto.calculoImc()==0) {
				mensaje="Se encuentra en su peso ideal";
			}else {
				if (objeto.calculoImc()==1) {
					mensaje="Se encuentra por encima de su peso ideal";
				}
			}
		}
		return mensaje;
	}
}

class noEstatico{
	private boolean mensaje;

	public boolean getMensaje() {
		return mensaje;
	}

	public void setMensaje(boolean mensaje) {
		this.mensaje = mensaje;
	}
	
	public noEstatico (boolean mensaje){
		this.mensaje=mensaje;
	}
	
	String mensajeEdad(){
		if (mensaje==true) {
			return "Es mayor de edad";
		}else {
			return "Es menor de edad";
		}
	}
	
}

public class entrega_5 {
	public static void main(String[] args) {
		String nombre;
		char sexo;
		float altura;
		GregorianCalendar fecha_nacimiento = new GregorianCalendar();
		float peso;
		int anyo = 0, mes = 0 , dia = 0;
		String [] aficiones = new String[5];
		Scanner sc = new Scanner(System.in);
		Arrays.fill(aficiones, "");
		System.out.println("Introduce el Nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce el Sexo");
		sexo = sc.nextLine().charAt(0);
		System.out.println("Introduce la altura");
		altura=Float.parseFloat(sc.nextLine());
		System.out.println("Introduce el peso");
		peso=Float.parseFloat(sc.nextLine());
		System.out.println("Introduce tus aficiones");
		for (short i = 0;i<aficiones.length;++i) {
			aficiones[i]=sc.nextLine();
		}
		System.out.println("Introduce el año de nacimiento");
		anyo=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el mes de nacimiento");
		mes=Integer.parseInt(sc.nextLine())-1;
		System.out.println("Introduce el dia de nacimiento");
		dia=Integer.parseInt(sc.nextLine());
		fecha_nacimiento.set(anyo, mes, dia);
		persona p1 = new persona();
		compNulos(p1);
		persona p2 = new persona(nombre,fecha_nacimiento,sexo);
		compNulos(p2);
		persona p3 = new persona(nombre,fecha_nacimiento,sexo,altura,peso,aficiones);
		compNulos(p3);
		noEstatico n1 = new noEstatico(p1.esMayorDeEdad());
		System.out.println("La persona 1 : " + n1.mensajeEdad());
		n1 = new noEstatico(p2.esMayorDeEdad());
		System.out.println("La persona 2 : " + n1.mensajeEdad());
		n1 = new noEstatico(p3.esMayorDeEdad());
		System.out.println("La persona 3 : " + n1.mensajeEdad());
		mensajeInformacion(p1);
		mensajeInformacion(p2);
		mensajeInformacion(p3);
		System.out.println(Estatico.mensajePeso(p1));
		System.out.println(Estatico.mensajePeso(p2));
		System.out.println(Estatico.mensajePeso(p3));
		
 	}
	
	static void compNulos(persona obj) {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar fecha_nacimiento1 = new GregorianCalendar();
		String [] aficiones = new String[5];
		if(obj.getNombre()==null) {
			System.out.println("No se encontro el nombre, introduzca uno:");
			obj.setNombre(sc.nextLine());
		}
		if(obj.getAltura()==0) {
			System.out.println("No se encontro la altura, introduzca uno:");
			obj.setAltura(Float.parseFloat(sc.nextLine()));
		}
		if(obj.getPeso()==0) {
			System.out.println("No se encontro el peso, introduzca uno:");
			obj.setPeso(Float.parseFloat(sc.nextLine()));
		}
		if (obj.getId()==0) {
			obj.generarIdentificador();
		}
		if (obj.getFecha_nacimiento().get(GregorianCalendar.YEAR)==fecha_nacimiento1.get(GregorianCalendar.YEAR)) {
			System.out.println("No se encontro fecha de nacimiento por favor introduzcala");
			fecha_nacimiento1= new GregorianCalendar(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())-1,Integer.parseInt(sc.nextLine()));
			obj.setFecha_nacimiento(fecha_nacimiento1);
		}
		if(obj.getAficiones().toString()==null) {
			System.out.println("No se encontraron aficiones, introduzca aficiones");
			for (short i = 0;i<obj.getAficiones().length;++i) {
				aficiones[i]=sc.nextLine();
			}
			obj.setAficiones(aficiones);
		}
		obj.comprobarSexo(obj.getSexo());
	}
	static void mensajeInformacion(persona objeto) {
		System.out.println(objeto);
	}
	
	
}
