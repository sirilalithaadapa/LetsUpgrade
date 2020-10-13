package Practice;

public class Employee {
	public String name;
	public int dob;
	public int year;
	public String month;
	public int salary;
	
	
	public void display() {
		System.out.println("The name is " + this.name);
		System.out.println("The date of birth is " + this.dob + " " + this.month + " " +this.year );
		System.out.println("The annual salary is " + this.salary * 12);
		System.out.println("Tax : " + getTaxAmount());
		
	}
	
	public double getTaxAmount() {
		int annual = this.salary * 12;
		if (annual >= 500000) {
			return 20.0 / 100 * this.salary;
		} else if (annual >= 400000) {
			return 15.0 / 100 * this.salary;
		} else if (annual >= 300000) {
			return 10.0 / 100 * this.salary;
		} else if (annual >= 200000) {
			return 5.0 / 100 * this.salary;
		} else {
			return 0.0;
		}
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name = "Hari";
		emp1.dob = 23;
		emp1.year = 1997;
		emp1.month = "August";
		emp1.salary = 50000;
		emp1.display();
	}
}
