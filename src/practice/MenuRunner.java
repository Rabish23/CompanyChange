package practice;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Enter Number1: ");
		int number1 = scanner.nextInt();
		System.out.print( "Enter Number2: ");
		int number2 = scanner.nextInt();
		
		System.out.println("Choices available are: ");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");
		
		
		System.out.print("Enter choice");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(number1 + number2);
			break;
		case 2:
			System.out.println(number1 - number2);
			break;
		case 3:
			System.out.println(number1 * number2);
			break;
		case 4:
			System.out.println(number1 / number2);
			break;
		default:
			System.out.println("Invalid");
			break;
		
		

	}

}}
