package proyecto;

public class metodoJunit {
public static class metodos{
	private boolean flag1=false, flag2 = false;
	
	public metodos(boolean flag1, boolean flag2) {
		this.flag1 = flag1;
		this.flag2 = flag2;
	}
	public boolean compruebaY() {
		if (flag1 == true && flag2 == true) {
			return true;
		}else 
			return false;
	}
	public boolean compruebaO() {
		if (flag1 == true || flag2 == true) {
			return true;
		}else 
			return false;
		
	}
	public boolean compruebaNo() {
		if (flag1 != false) {
			return true;
		}else {
			if (flag2 != false) {
				return true;
			}else
				return false;
		}
			
		
	}
}
}
