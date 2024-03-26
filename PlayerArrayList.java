import java.util.Scanner;
import java.util.ArrayList;
public class PlayerArrayList {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> namelist = new ArrayList<>();
        int players = 0;
        System.out.println("Welcome. How many players are playing this game? (Minimum 5): ");
        while (players < 5){
            players = scan.nextInt();
        }
        scan.nextLine();   
        for (int i = 1; i <= players; i++){
            System.out.println("Player " + i + ". Please enter your name: ");
            String name = scan.nextLine();
            namelist.add(name);
        }
        System.out.println("All players have entered their names. The game will be launched shortly.");
        namelist.clear();
        scan.close();
    }
}