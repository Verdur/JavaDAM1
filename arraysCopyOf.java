package proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class arraysCopyOf {
	public static void main(String[] args) {
		String [] arr1;
		String input ="";
		int i = 0;
		Scanner sc =  new Scanner(System.in);
		/*
		arr1 = new String[5];
		Arrays.fill(arr1, "aa");
		for(int i = 0;i<arr1.length;++i) {
		System.out.println(arr1[i]);
		}
		arr1= Arrays.copyOf(arr1, 12);
		for(int i = 0;i<arr1.length;++i) {
			System.out.println(arr1[i]);
			}
			*/
		arr1 = new String[1];
		i=1;
		do {
			input=sc.nextLine();
			arr1 = Arrays.copyOf(arr1, i);
			arr1[i-1] = input;
			++i;
		}while(input!="");
		
		for(i = 0;i<arr1.length;++i) {
			System.out.println(arr1[i]);
			}
	}
}
