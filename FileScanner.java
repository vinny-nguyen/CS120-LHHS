import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File fileToRead = new File("c:/Users/phungu37341/OneDrive - EECD EDPE/CS120/Assessment 02 Feb 14, 2024/src/input.txt");
        Scanner inputFile = new Scanner(fileToRead);
        System.out.println("The following text was read from your file");
        System.out.println("*****************************************");
        int num1 = inputFile.nextInt(); 
        System.out.println("The integer read is: " + num1);
        Double num2 = inputFile.nextDouble();
        System.out.println("The floating point number read is: " + num2);
        String name = inputFile.next();
        System.out.println("The string read is: '" + name + "'");
        System.out.println("Hi! " + name + ", the sum of " + num1 + " and " + num2 + " is " );
        inputFile.close();
    }
}