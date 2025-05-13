import javax.swing.JOptionPane;

public class Uni4Exe03 {
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        if(num1 > num2){
            JOptionPane.showMessageDialog(null,"Número" + num1 + "é maior que "+ num2);
        } else {
            JOptionPane.showMessageDialog(null,"Número" + num2 + "é maior que "+ num1);
        }
    }
}
