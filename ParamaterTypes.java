public class ParamaterTypes {
  // Method declaration with two Formal Parameters: num1 and num2 
  public static int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }
  public static void main(String[] args) {
    // Calling the add method with the Actual Parameters: 5 and 10
    int result = add(5, 10);
    System.out.println("The sum of 5 + 10 is: " + result);
  }
}