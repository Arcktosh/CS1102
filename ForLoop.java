public class ForLoop {
	
	public static void forLoop() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
		    sum += i;
		}
		System.out.println("The sum is: " + sum);
	}
	
	public static void whileLoop() {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
		    sum += i;
		    i++;
		}
		System.out.println("The sum is: " + sum);
	}
	
	public static void doWhileLoop () {
		int sum = 0;
		int i = 1;
		do {
		    sum += i;
		    i++;
		} while (i <= 10);
		System.out.println("The sum is: " + sum);
	}	

	public static void main(String[] args) {
		doWhileLoop();
		whileLoop();
		forLoop();
	}
}