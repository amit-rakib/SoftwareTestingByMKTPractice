package OOP;

// class 1
abstract class Shape {
	
     abstract  double calculation();
}


 // class 2

 class Circle extends Shape {
	 
	 private double radius;
	 
	 public Circle(double r){
		 this.radius = r;
	 }
	 
	 
	 @Override
	 double calculation() {
		return Math.PI*radius*radius;
		 
	 }

       
	
}
 
 
 // class 3
 class Rectangle extends Shape {
	 
	 private double len, wid;
	 
	 public Rectangle(double len, double wid) {
		 this.len = len;
		 this.wid = wid;
	 }
	 
	 
	 @Override
	 double calculation() {
		 return len*wid;
	 }
	 
 }


public class ShapeTest {

	public static void main(String[] args) {
		
		
		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(4,5);
		
		System.out.println(circle.calculation());
		System.out.println(rectangle.calculation());

		
    
	}

}
