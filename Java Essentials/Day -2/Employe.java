public class Employee {
	public String name;
	public int age;
	public String city;
	
	public void display() {
		System.out.println("The name is " + this.name);
		System.out.println("The age is " + this.age);
		System.out.println("The city is " + this.city);
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.name = "Saurab";
		emp1.age = 23;
		emp1.city = "chennai";
		
		emp2.name = "Surya";
		emp2.age = 20;
		emp2.city = "hyderabad";
		
		emp1.display();
	}
}
