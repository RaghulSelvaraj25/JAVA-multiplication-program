package PACK.PROJ;
import java.util.Scanner;

public class alphabetvowelorconsonent {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a singile alphabet: ");
				
					char ch = scanner.next().charAt(0);
			
				if(Character.isLetter(ch)) {
					ch = Character.toLowerCase(ch);
					if((ch=='a' )||(ch=='e' ) || (ch=='i' ) || (ch=='o') || (ch=='u' )) {
						System.out.println(ch + " is a vowel.");
					}else {
						System.out.println(ch + " is a consonent.");
					}
					
				}else {
					System.out.println("Invalid input! Please enter an alphabet.");
				}
				 scanner.close();

			}

		}
