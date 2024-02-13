import java.util.Scanner; // imports the package from java API
public class ScannerInput {
    public static void main(String[] args) throws Exception {
        // Declare variables used in the program
        int num1;
        double num2;
        double sum;
        double product;
        double div;
        String name;

        // Initialize a scanner object
        Scanner scan = new Scanner(System.in);

        //Read input from keyboard
        System.out.println("Enter your name: ");
        name = scan.next();
        System.out.println("Hello " + name +", please enter an integer: ");
        num1 = scan.nextInt(); // reads the value from user input
        System.out.println("Enter a float: ");
        num2 = scan.nextDouble();

        sum = num1+num2;
        product = num1*num2;
        div = num1/num2;
        System.out.println("Thank you, " + name +".");
        System.out.println("Sum of: " + num1 + " and " + num2 + " is: " + sum + ".");
        System.out.println("Product of: " + num1 + " and " + num2 + " is: " + product + ".");
        System.out.println("Division of: " + num1 + " and " + num2 + " is: " + div + ".");
        scan.close();
    }
}
