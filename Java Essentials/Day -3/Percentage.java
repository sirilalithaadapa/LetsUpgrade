import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer[] marks = new Integer[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the marks in Subject " + (i + 1) + ": ");
			marks[i] = in.nextInt();
		}
		
		double sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += marks[i];
		}
		
		double percentage = (sum/500) * 100;
		
		System.out.println("Percentage: " + percentage);
		
		System.out.print("Grade: ");
		if(percentage>=80)
        {
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80)
        {
           System.out.print("B");
        } 
        else if(percentage>=40 && percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
		
		System.out.println();
	}
}
