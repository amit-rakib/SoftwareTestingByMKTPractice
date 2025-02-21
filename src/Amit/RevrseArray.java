package Amit;

import java.util.Arrays;

public class RevrseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 1, 2, 3, 4, 5};
		
		int newArray[] = new int[array.length];
		
		for (int i=array.length-1, j=0; i>=0; i--, j++) {
			newArray[j] = array[i]; 
		}
		
		System.out.println(Arrays.toString(newArray));

	}

}
