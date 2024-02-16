import java.util.Scanner;
public class CircleComputation {
    public static void main(String[] args) throws Exception {
        // Circle computation
        System.out.println("Exercise (3): ");
            Scanner scan = new Scanner(System.in);
           System.out.println("Enter the radius: ");
           double num1 = scan.nextDouble();
           double pi = Math.PI;
           double area = pi * (num1 * num1);
           double circ = pi * (2 * num1);
           System.out.printf("The area is: %.2f", area);
           System.out.println("");
           System.out.printf("The circumfrence is: %.2f", circ);
           scan.close();
        }
}
