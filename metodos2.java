package proyecto;

import java.util.Scanner;

class clase{
	private int num;
	private String alpha;
	clase(String alpha) {
		num++;
		this.alpha=alpha;
	}
	public int getNum() {
		return num;
	}
	public String getAlpha() {
		return alpha;
	}
	
	public String toString() {
		return "clase [num=" + num + ", alpha=" + alpha + "]";
	}
	
	
}
public class metodos2 {
	
	public static void main(String[] args) {
		clase obj1 = new clase("Uno");
		clase obj2 = new clase("Dos");
		clase obj3 = new clase("Tres");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}
}
