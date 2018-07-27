package q1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Arithmetic reference1 = new Addition();
		Arithmetic reference2 = new Subtraction();
		Arithmetic reference3 = new Multiplication();
		Arithmetic reference4 = new Division();
		
		Arithmetic[] reference = {reference1, reference2, reference3, reference4};
		
		System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		
		//for taking choice
				int choice;	
		//accepting choice of user
		System.out.println("Enter your choice: ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
		//Numbers from user
		System.out.println("Enter two numers: ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		
		//Result
		System.out.println("Result is: " + reference[choice-1].calculate(num1, num2));
		scanner.close();
		}

}