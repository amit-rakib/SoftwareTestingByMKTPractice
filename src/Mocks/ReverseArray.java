package Mocks;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
        
		int ar[] = { 2, 3, 4, 5, 6, 7, 8 };
		
		int n = ar.length;
		
		int newAr[] = new int[n];
		
		for(int i = n-1, j = 0; i>=0; i--, j++) {
			
			newAr[j] += ar[i]; 
		}
		
		
		System.out.println(Arrays.toString(newAr));
		
		
	}

}
