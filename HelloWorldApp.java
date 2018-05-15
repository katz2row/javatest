/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
import java.util.Scanner;
class HelloWorldApp {
    public static void main(String[] args) {
		
		int i;
		
		Scanner reader = new Scanner(System.in);
		
		String ask_how;
		System.out.print("Do you want to be polite or nag? Enter your answer (Polite or Nag): ");
		ask_how = reader.next();
		
		if (ask_how.equals("Nag"))
			for (i = 0; i < 3; i++) {
				System.out.println("Hello World!"); // Display the string.
				}
		
		else 
			System.out.println("Hello World!"); // Display the string.
    }
}
