package OOP;

import java.util.ArrayList;
import java.util.List;

class User {
	
	private String name;
	private String email;
	
	
	public User(String n, String e) {
		this.name = n;
		this.email = e;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
}

class Order {
	
	private List<String> orderList;
	
	public Order() {
		this.orderList = new ArrayList<>();
	}
	
	
	public void addOrder(String order) {
		orderList.add(order);
	}
	
	public void displayOrders(User user) {
		System.out.println("User: "+user.getName()+ " Order"+ orderList);
	}
	
	
}

class EmailService {
	public void sendOrderConfirmation(User user) {
		System.out.println(user.getEmail());
	}
}




public class OrderProcessingSystem {

	public static void main(String[] args) {
        
		
		User u1 = new User("Amit", "amit@gmail.com");
		
		Order order = new Order();
		
		EmailService email = new EmailService();
		
		
		order.addOrder("Laptop");
		order.displayOrders(u1);
		email.sendOrderConfirmation(u1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
