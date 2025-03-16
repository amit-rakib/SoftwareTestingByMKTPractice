package OOP;

public class Student {
	
	private String name;
	private int age;
	private String id;
	
	
	public Student(String n, int a, String id) {
		this.name = n;
		this.age = a;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}
	}
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void info() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);

	}
	

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Amit", 24, "1");
		
		s1.info();

		s1.setAge(23);
		s1.setName("Rakib");
		s1.setId("2");
		s1.info();

	}

}
