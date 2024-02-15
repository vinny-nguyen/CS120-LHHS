import java.util.Scanner;
public class KeyboardScanner {
    public static void main(String[] args) throws Exception {
    // KeyboardScanner
    System.out.println("Exercise (1): ");
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter an integer: ");
       int num1 = scan.nextInt();
       System.out.println("Enter a floating point number: ");
       double num2 = scan.nextDouble();
       System.out.println("Enter your name: ");
       String name = scan.next();
       Double sum1 = num1 + num2;
       System.out.println("Hi! " + name + ", the sum of " + num1 + " and " + num2 + " is " + sum1);
       scan.close();
    }
}
