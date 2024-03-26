import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean win = false;
        System.out.println("Player 1, please choose a number from 0 - 20: ");
        double num1 = scan.nextDouble();
        //if (num1 != (int)num1 ){
            //System.out.println("The number" + num1 + "was rounded to:  " + (int)num1);
            //num1 = (int)num1;
        //}
        while (num1 != Math.floor(num1)){
            System.out.println("Your number has to be a Whole number, please choose again: ");
            num1 = scan.nextDouble();
        }
        while (num1 < 1 || num1 > 20){
            System.out.println("Your number has to be from 0 - 20, please choose again: ");
            num1 = scan.nextDouble();
        }
        System.out.print("\033[H");
        System.out.print("\033[2J");
        System.out.println("");
        System.out.println("Player 2, please choose a number from 0 - 20, you have 5 Guesses: ");
        double num2 = scan.nextDouble();
        while (win == false){
        //while (num2 != (int)num2){
            //System.out.println("The number is a Whole number, please choose again: ");
            //num2 = scan.nextInt();
        //}
        //while (num2 < 0 || num2 > 20){
            //System.out.println("The number is from 0 - 20, please choose again: ");
            //win = false;
            //num2 = scan.nextInt();
        //}
        for (int guess = 5; guess > 0; guess--){
        while (guess > 0 && guess < 5){
        while (num2 != num1){
            while (num2 != Math.floor(num2)){
                System.out.println("The number is a Whole number. You have " + guess + " Guesses Left. Try again ");
                num2 = scan.nextDouble();
                guess--;
                win = false;
            }
            while (num2 < 0 || num2 > 20){
                System.out.println("The number is from 0 - 20. You have " + guess + " Guesses Left. Try again  ");
                num2 = scan.nextDouble();
                guess--;
                win = false;
            }
            //if (guess == 0){2
                //System.out.println("Incorrect. You have 0 Guesses Left. You lost.");
                //win = false;
                //scan.close();
           //}
            //if (num2 == num1){
                //System.out.println("Congrats. You have guessed the right number.");
                //win = true;
                //scan.close();
            System.out.println("Incorrect. You have " + guess + " Guesses Left. Try again. ");
            num2 = scan.nextDouble();
            guess--;
            win = false;
            if (num2 != num1 && guess == 0){
                System.out.println("Incorrect. You have 0 Guesses Left. You lost.");
                scan.close(); 
                System.exit(0); 
            }
                }
            if (num2 == num1){
            System.out.println("Congrats. You have guessed the right number.");
            win = true;
            scan.close();
            System.exit(0); 
            }
        }
    }
            //if (num2 == num1){
            //System.out.println("Congrats. You have guessed the right number.");
            //win = true;
            //scan.close();
            //}
        //}
        //System.out.println("Congrats. You have guessed the right number.");
        //scan.close();
        //win = true;
        //System.exit(0); 
    }
        }
    }