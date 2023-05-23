import textio.TextIO;
import java.util.ArrayList;

public class BoxingExample {
	
	public static void main(String[] args) {
		System.out.println("Starting program...");
		Example();
	}

	private static void Example() {
		// Setting up the ArrayList.
		ArrayList<Byte> list;
		list = new ArrayList<Byte>();
		
		while (true) {
			// setting up num1.
			System.out.println("Type what number you want to be divided: ");
			byte num1 = TextIO.getlnByte();
			
			
			// setting up num2.
			System.out.println("Type in the dividor: ");
			byte num2 = TextIO.getlnByte();
			
			
			// giving output.
			byte num3 = (byte)(num1/num2);
			System.out.println("Your output is: " + num3);
			System.out.println();
			
			list.add(num3); // Autoboxing happens here.
			
			System.out.println("Do you want to continue?: ");
			System.out.println("Type 0 to end the program");
			Byte n = TextIO.getlnByte();
			if (n <= 0) {
				break;
			}
			
		}
		
		System.out.println("The content of your list is: ");
		
		for (int i = 0; i <list.size(); i++) {
			Byte content = list.get(i); // Unboxing happens here.
			System.out.println(content);
		}
		
	}

}
