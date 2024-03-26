import java.util.*;
public class Methods {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the employee's salary?: ");
        double salary = scan.nextDouble();
        System.out.println("How many times do you want to raise their salary by 5%?: ");
        int raise = scan.nextInt();
        double raisedsalary = salary + salary * (0.05 * raise);
        System.out.println("The employee's paycheque will be: " + raisedsalary + ".");
        scan.close();
    }
}

