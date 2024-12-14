package project.multitable;

import java.util.Scanner;

public class multiplicationtablepro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String closedfinal;
		 do{
			System.out.print("Please Enter number for multiplication Table:");
			int number = scanner.nextInt();
			System.out.println("Multiplication Table for " + number +" :");
			for(int i=1;i<=10;i++) {
				System.out.println(number + " X " +i +" = " +(number*i));
			}
				System.out.print("\n Do you want generate another table?(yes/no)");
				closedfinal = scanner.next();
				
			}
		 
		 while(closedfinal.equalsIgnoreCase("yes"));
			System.out.println("Thanks for using the program");
			scanner.close();
		 
	}
}

		
