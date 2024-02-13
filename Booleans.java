import java.util.Scanner;
public class Booleans {
    public static void main(String[] args) throws Exception {
        int a = 5;
        int b = 3;
        int c = 5;
        String item1 = "apples";
        String item2 = "bananas";

        // Using comparison operators
        System.out.println("Using comparison operators: ");
        System.out.println(a > b); // returns true, because 5 is higher than 3
        System.out.println(a >= c); // returns true, because 5 equals 5
        System.out.println(a == c); // returns true, because 5 equals 5
        System.out.println(item1 == item2); // returns false because strings are not the same
        //alternatively, using the equals() method
        System.out.println(item1.equals(item2)); // returns false because strings are not the same
        //Using Logic Operators
        System.out.println(a >= c && a == c); // AND operator: returns true, both conditions are true
        System.out.println(a < c || a == c); //  OR operator: returns true, because a==c 
        System.out.println(!(a < c || a == c)); //  NOT operator: returns false, because ! 

        // If...else...
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("If...else...: ");
        int x;
        int y;
        int item3;
        int item4;
        System.out.println("Please enter a number for x: ");
        x = scan.nextInt();
        System.out.println("Please enter a number for y: ");
        y = scan.nextInt();
        System.out.println("Please enter a word for item3: ");
        item3 = scan.nextInt();
        System.out.println("Please enter a word for item4: ");
        item4 = scan.nextInt();

        if (x == y){
            System.out.println("This is a True statement.");

        } else {
            System.out.println("This is a False statement.");
        }
        
        if (item3 == item4){
            System.out.println("This is a True statement.");
        } else {
            System.out.println("This is a False statement.");
        }
        scan.close();
        }
        int i = 0;
        boolean status = false;{
        //Has the loop repeated 20 times?
        while (status == false){
            if (i == 19){
                status = true;
                System.out.println("Loop iteration: " + (i+1) + " ...All Done!");
            }else{
                status = false;
                System.out.println("Loop iteration: " + (i+1) + " ...Loop Again");
                i++;
            }
        }
    }
}


