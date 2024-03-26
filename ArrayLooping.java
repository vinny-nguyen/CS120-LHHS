import javax.swing.JOptionPane;
import java.util.Scanner;
public class ArrayLooping {
    public static void main(String[] args) throws Exception {
        //boolean solve = true;
        Scanner scan = new Scanner(System.in);
        boolean [] status = {true, true, false, true};
        for (int i = 0; i < status.length; i++){
            while (!status[i]){
                JOptionPane.showMessageDialog(null, "The alarm has been triggered.");
                status[3] = true;
                String statusInputString = JOptionPane.showInputDialog("Has The Problem Been Resolved? (Y/N): ");
                if (statusInputString.equalsIgnoreCase("Y")) {
                    status[i] = true;
                    JOptionPane.showMessageDialog(null, "The problem has been resolved.");
                    scan.close();
                } else {
                    status[3] = false;
                    JOptionPane.showMessageDialog(null, "The problem has not been resolved.");
                }
            }            
        }


    }
}
