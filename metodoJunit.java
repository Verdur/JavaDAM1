package proyecto;

public class metodoJunit {
public static class metodos{
	private boolean flag1=false, flag2 = false;
	
	public metodos(boolean flag1, boolean flag2) {
		this.flag1 = flag1;
		this.flag2 = flag2;
	}
	public boolean compruebaY() {
		return flag1 && flag2;
	}
	public boolean compruebaO() {
		return flag1 || flag2;
		
	}
	public boolean compruebaNo() {
		return !flag1;	
	}
}
}
