package proyecto;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

class persona{
	private static final char DEFAULTSEXO = 'M';
	private final short minIMC = 20;
	private final short maxIMC = 25;
	public final static short infPeso = -1;
	public final static short masPeso = 1;
	public final static short buePeso = 0;
	private int id;
	private String nombre;
	private GregorianCalendar fecha_nacimiento = new GregorianCalendar();
	private	char sexo;
	private float altura;
	private float peso;
	private String [] aficiones = new String[1];
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
	public String getAficiones(int index) {
		return aficiones[index];
	}
	public void setAficiones(String[] aficiones) {
		this.aficiones=Arrays.copyOf(aficiones, aficiones.length);
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	persona (){
		this.id= generarIdentificador();
		this.sexo=DEFAULTSEXO;
		Arrays.fill(aficiones, "");
	}
	public persona(String nombre, GregorianCalendar fecha_nacimiento, char sexo) {
		this ();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		Arrays.fill(aficiones, "");
	}
	
	public persona(String nombre, GregorianCalendar fecha_nacimiento, char sexo, float altura, float peso,
			String[] aficiones) {
		this.id= generarIdentificador();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.aficiones=Arrays.copyOf(aficiones, aficiones.length);
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
			imc=infPeso;
		}else {
			if(calcImc>=minIMC && calcImc<=maxIMC) {
				imc=buePeso;
			}else
				imc=masPeso;
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
	
	public static char comprobarSexo(char sexo) {
		sexo = Character.toUpperCase(sexo);
		if(sexo!='H') {
			return  DEFAULTSEXO;
		}else
			return sexo;
	}
	
	private int generarIdentificador() {
		Random r = new Random();
		int newID = 100000 + r.nextInt(900000);
		return newID;
	}
	
}

class Estatico {
	static String mensajePeso(persona objeto) {
		String mensaje = "";
		if (objeto.calculoImc()==persona.infPeso) {
			mensaje="Se encuentra por debajo de su peso ideal";
		}else {
			if (objeto.calculoImc()==persona.buePeso) {
				mensaje="Se encuentra en su peso ideal";
			}else {
				if (objeto.calculoImc()==persona.masPeso) {
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
		String nombre="",input="";
		char sexo;
		float altura;
		GregorianCalendar fecha_nacimiento = new GregorianCalendar();
		float peso;
		int anyo = 0, mes = 0 , dia = 0,i=0;
		String [] aficiones = new String[1];
		Scanner sc = new Scanner(System.in);
		Arrays.fill(aficiones, "");
		System.out.println("Introduce el Nombre");
		nombre = sc.nextLine();
		System.out.println("Introduce el Sexo");
		sexo = persona.comprobarSexo(sc.nextLine().charAt(0));
		System.out.println("Introduce la altura");
		altura=Float.parseFloat(sc.nextLine());
		System.out.println("Introduce el peso");
		peso=Float.parseFloat(sc.nextLine());
		System.out.println("Introduce tus aficiones");
		input=sc.nextLine();
		i=1;
		while(input!="") {
			aficiones= Arrays.copyOf(aficiones, i);
			aficiones[i-1]=input;
			++i;
			input=sc.nextLine();
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
		String [] aficiones = new String[1];
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
		if (obj.getFecha_nacimiento().get(GregorianCalendar.YEAR)==fecha_nacimiento1.get(GregorianCalendar.YEAR)) {
			System.out.println("No se encontro fecha de nacimiento por favor introduzcala");
			fecha_nacimiento1= new GregorianCalendar(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())-1,Integer.parseInt(sc.nextLine()));
			obj.setFecha_nacimiento(fecha_nacimiento1);
		}
		if (obj.getAficiones(0) == "") {
			System.out.println("Introduce tus aficiones");
			String input=sc.nextLine();
			int i=1;
			while(input!="") {
				aficiones= Arrays.copyOf(aficiones, i);
				aficiones[i-1]=input;
				++i;
				input=sc.nextLine();
			}
			obj.setAficiones(aficiones);
		}
	}
	static void mensajeInformacion(persona objeto) {
		System.out.println(objeto);
	}
	
	
}
