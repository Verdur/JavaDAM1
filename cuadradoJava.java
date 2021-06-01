package proyecto;

import java.util.Arrays;

public class cuadradoJava {
	public static void main(String[] args) {
		int [] [] arr = new int [5] [5];
		for (short i = 0;i<arr.length;++i) {
			Arrays.fill(arr[i], 1);
		}
		for (short i = 1;i<arr.length;++i) {
			for (short f = 1;f<arr[i].length;++f) {
				arr [i] [f] = arr[i][f-1] + arr[i-1] [f];
			}
		}
		for (short i = 0;i<arr.length;++i) {
			for (short f = 0;f<arr[i].length;++f) {
				System.out.printf("%3d",arr[i][f]);
			}
			System.out.println();
		}
	}
}
