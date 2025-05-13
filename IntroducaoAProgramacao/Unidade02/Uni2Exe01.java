import javax.swing.JOptionPane;

public class Uni2Exe01 {
     public static void main(String[] args) {
        
            double oneValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
            
            double twoValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));

            double sum = oneValue + twoValue;

            JOptionPane.showMessageDialog(null,"A soma dos valores é: " + sum);
     }
}