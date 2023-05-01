public class WhileLoop {
	
	public static void whileLoop () {
		int i = 1;
		while (i <= 10) {
		    System.out.println(i);
		    i++;
		}
	}
	
	public static void whileDoWhile() {
		int i = 1;
		do {
		    System.out.println(i);
		    i++;
		} while (i <= 10);
	}
	
	public static void whileFor() {
		for (int i = 1; i <= 10; i++) {
		    System.out.println(i);
		}
	}

	public static void main(String[] args) {
		whileLoop();
		whileDoWhile();
		whileFor();
	}
}