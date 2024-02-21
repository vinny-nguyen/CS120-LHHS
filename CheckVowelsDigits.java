import java.text.DecimalFormat;
import java.util.Scanner;
public class CheckVowelsDigits {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercise (5): ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String string = scan.next();
        int vowel = 0;
        int digit = 0;
        DecimalFormat df = new DecimalFormat("##.00");
        for (int i = 0 ; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
               vowel ++;
            }
         }
         double dvowel = vowel;
         double vpercent = (dvowel/string.length())*100;
         System.out.println("String length: " + string.length());
         System.out.printf("Number of vowels: " + vowel + " (" + df.format(vpercent) + ")");
        for (int i = 0 ; i<string.length(); i++){
            char ch = string.charAt(i);
            if(ch == '0'|| ch == '1'|| ch == '2' ||ch == '3' ||ch == '4'||ch == '5'||ch == '6'||ch == '7'||ch == '8'||ch == '9'){
               digit ++;
            }
         }
         System.out.println("");
         double ddigit = digit;
         double dpercent = (ddigit/string.length())*100;
         System.out.println("Number of digits: " + digit + " (" + df.format(dpercent) + ")");    
         scan.close();
}
}
