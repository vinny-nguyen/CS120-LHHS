// Java warmup #1 (March 21, 2024)
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime: ");
        int number = scan.nextInt();
        boolean prime = true;
        for (int i = 2; i < number ; i++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("The number " + number + " is prime.");
        } else{
            System.out.println("The number " + number + " is not prime.");
        }
        scan.close();
    }
}
