package proyecto;

import java.util.Arrays;

class serie{
	private String titulo;
	private short numero_cap;
	private char genero;
	private String guionista;
	private String [] actores =  new String [5];
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
		this.numero_cap=10;
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
		String [] actores =  new String [5];
		Arrays.fill(actores, "");
		serie s_1 = new serie();
		
		//usar gets para ver valores por defecto, si hay valores por defecto pedimos el dato 
		serie s_2 = new serie("Kung Fu Panda","David");
		serie s_3 = new serie ("Shin Chan",(short)8,'F',"Pepe",actores,(short)11);
		
	}
}