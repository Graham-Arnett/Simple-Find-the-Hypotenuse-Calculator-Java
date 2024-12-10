package main;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.println("Pythagorean Formula Calculation App\n\n");
		do 
		{
		System.out.print("Enter for side a: ");
		int sideA = scanner.nextInt();
		
		System.out.print("Enter for side b: ");
		int sideB = scanner.nextInt();
		
		int aSquare = sideA * sideA;
		int bSquare = sideB * sideB;
		int hypotenuse = bSquare + aSquare;
		
		
		System.out.print("The hypotenuse is " + Math.sqrt(hypotenuse));
			
		System.out.print("Go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
		
	}

}
