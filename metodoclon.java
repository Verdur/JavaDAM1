package proyecto;
class prueba{
	private int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public prueba(int num) {
		this.num = num;
	}
	
	public prueba clon(){
		
		prueba clon = new prueba(num);
		
		return clon;
		
	}

	public String toString() {
		return "prueba [num=" + num + "]";
	}
	
}
public class metodoclon {
	public static void main(String[] args) {
		prueba test = new prueba(9);
		modificar(test.clon());
		System.out.println(test);
		modificar(test.clon());
		System.out.println(test);
	}
	
	static void modificar (prueba obj) {
		obj.setNum(5);
		System.out.println(obj);
	}
}
