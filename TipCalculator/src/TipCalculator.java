/*Adarsh Tailor
1/29/2022
JDK 14.0.2
Calculate tip amount
*/
import javax.swing.JOptionPane;
import java.text.NumberFormat;
public class TipCalculator {  
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null,"Enter the total bill");
        double bill=Double.parseDouble(input);
        input=JOptionPane.showInputDialog(null,"Enter the tip percentage "
                + "as a decimal");
        double percentage=Double.parseDouble(input);
        double tipAmount=bill*percentage;
        double percentageConverted=percentage*100;
        NumberFormat dollaSign=NumberFormat.getCurrencyInstance();
        
        JOptionPane.showMessageDialog(null,"Bill amount: "+ dollaSign.format(bill)+
                "\nTip percentage: "+percentageConverted+"%"+
                "\nTip Amount: "+dollaSign.format(tipAmount));
    }
}
