import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercise (4): ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scan.next();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("The reverse of the String '" + string + "' is '" + reverse +"'." );
scan.close();
}
}
