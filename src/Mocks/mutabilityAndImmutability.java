package Mocks;

public class mutabilityAndImmutability {

	public static void main(String[] args) {
          
		
		// String - immutable 
		
		String name = "Amit";
		
        name.concat("Rakib");
        
		System.out.println(name);
		
		
		// String Buffer - mutable
		
		StringBuffer sb = new StringBuffer("Amit");
		
		sb.append("Rakib");
		
		System.out.println(sb);
		
		
		// String Builder - mutable
		
		StringBuilder sb1 = new StringBuilder("Hello");
		
		sb1.append("World");
		
		System.out.println(sb1);
		
	}

}
