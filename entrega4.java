package proyecto;

import java.util.Arrays;
import java.util.Scanner;

class serie{
	public final static int TAM=5;
	private final int DEFAULTCAP=10;
	private String titulo;
	private short numero_cap;
	private char genero;
	private String guionista;
	private String[] actores =  new String [TAM];
	private short precio;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public short getNumero_cap() {
		return numero_cap;
	}
	public void setNumero_cap(short numero_cap) {
		this.numero_cap = numero_cap;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getGuionista() {
		return guionista;
	}
	public void setGuionista(String guionista) {
		this.guionista = guionista;
	}
	public String[] getActores() {
		return actores;
	}
	public String getActores(int index) {
		return actores[index];
	}
	public void setActores(String[] actores) {
		this.actores = actores;
	}
	public short getPrecio() {
		return precio;
	}
	public void setPrecio(short precio) {
		this.precio = precio;
	}
	
	public serie() {
		this.numero_cap=DEFAULTCAP;
		this.genero='D';
		Arrays.fill(this.actores, "");
	}
	
	public serie(String titulo,String guionista) {
		this();
		this.titulo = titulo;
		this.guionista = guionista;
		
	}
	
	public serie(String titulo, short numero_cap, char genero, String guionista, String[] actores, short precio) {
		this.titulo = titulo;
		this.numero_cap = numero_cap;
		this.genero = genero;
		this.guionista = guionista;
		this.actores = actores;
		this.precio = precio;
	}
	
	
}

public class entrega4 {
	public static void main(String[] args) {
		String [] actores =  new String [serie.TAM];
		
		Arrays.fill(actores, "");
		serie s_1 = new serie();
		mirarNulos(s_1);
		serie s_2 = new serie("Kung Fu Panda","David");
		serie s_3 = new serie ("Shin Chan",(short)8,'F',"Pepe",actores,(short)11);
		imprimirObjeto(s_1);
		imprimirObjeto(s_2);
		imprimirObjeto(s_3);
		modificarObjeto(s_2);
		imprimirObjeto(s_2);
		
	}
	
	static void imprimirObjeto(serie objeto) {
		System.out.println("Titulo : "+objeto.getTitulo()+" Genero :  "+objeto.getGenero()+" Guionista : "+objeto.getGuionista()+" Capitulos : "+objeto.getNumero_cap()+" Precio : "+objeto.getPrecio());
		System.out.print("Actores : ");
		for (int i=0;i<objeto.getActores().length;++i) {
			System.out.print(objeto.getActores(i)+" ");
		}
		System.out.println();
	}
	
	static void modificarObjeto(serie objeto) {
		short i = 0;
		String titulo = "";
		String guionista = "";
		short precio = 0;
		short numero_cap= 0;
		char genero = ' ';
		String [] actores =  new String [objeto.getActores().length];
		Arrays.fill(actores, "");
		System.out.println("Introduce el titulo de la serie");
		titulo=pedirString();
		objeto.setTitulo(titulo);
		System.out.println("Introduce el nombre del guionista");
		guionista=pedirString();
		objeto.setGuionista(guionista);
		System.out.println("Introduce el precio de la serie");
		precio=pedirShort(precio);
		objeto.setPrecio(precio);
		System.out.println("Introduce el numero de capitulos");
		numero_cap=pedirShort(numero_cap);
		objeto.setNumero_cap(numero_cap);
		System.out.println("Introduce el genero");
		do {
			genero=pedirString().charAt(0);
		}while(genero != 'D' && genero != 'S' && genero != 'C' && genero != 'T' );
		objeto.setGenero(genero);
		System.out.println("Introduce Actores");
		actores[0]=pedirString();
		i=1;
		while (actores[i-1]!="" && i<objeto.getActores().length) {
			actores[i]=pedirString();
			++i;
		}
		objeto.setActores(actores);
	}
	
	static void mirarNulos(serie s_1) {
		String titulo = "";
		String guionista = "";
		short precio = 0;
		
		if(s_1.getTitulo()==null) {
			titulo=pedirString();
			s_1.setTitulo(titulo);
		}
		if(s_1.getGuionista()==null) {
			guionista=pedirString();
			s_1.setGuionista(guionista);
		}
		if (s_1.getPrecio()==0) {
			precio=pedirShort(precio);
			s_1.setPrecio(precio);
		}
			
	}
	
	static String pedirString() {
		String peticion = " ";
		Scanner ask = new Scanner(System.in);
		peticion=ask.nextLine();
		return peticion;
	}
	
	static short pedirShort(short peticion ) {
		Scanner ask = new Scanner(System.in);
		peticion=Short.parseShort(ask.nextLine());
		return peticion;
	}
}