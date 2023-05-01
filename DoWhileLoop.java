import java.util.Scanner;

public class DoWhileLoop {
	
	public static void doWhileLoop () {
		try (Scanner input = new Scanner(System.in)) {
			int number = 0;
			do {
			    System.out.print("Enter a positive number: ");
			    number = input.nextInt();
			} while (number <= 0);
			System.out.println("You entered a positive number: " + number);
		}
	}
	
	public static void whileLoop() {
		try (Scanner input = new Scanner(System.in)) {
			int number = 0;
			while (number <= 0) {
			    System.out.print("Enter a positive number: ");
			    number = input.nextInt();
			}
			System.out.println("You entered a positive number: " + number);
		}
	}
	
	public static void forLoop() {
		try (Scanner input = new Scanner(System.in)) {
			int number = 0;
			for (;;) {        	
				System.out.print("Enter a positive number: ");
				number = input.nextInt();
				if (number > 0) {
					break;
			    }
			}
			System.out.println("You entered a positive number: " + number);
		}
	}

	public static void main(String[] args) {
		doWhileLoop();
		whileLoop();
		forLoop();
	}
}