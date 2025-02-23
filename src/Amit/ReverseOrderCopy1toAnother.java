package Amit;

import java.util.Arrays;

public class ReverseOrderCopy1toAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array1[] = { 1, 2, 3, 4, 5, 6};
		
		int array2[] = new int[array1.length];
		
		
		for (int i = array1.length-1, j=0; i>=0; i--, j++) {
			array2[j] = array1[i];
		}
		
		System.out.println(Arrays.toString(array2));

	}

}
