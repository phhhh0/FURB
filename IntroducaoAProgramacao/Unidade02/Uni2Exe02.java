import javax.swing.JOptionPane;

public class Uni2Exe02 {
      public static void main(String[] args) {
        
            double oneValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
            
            double twoValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));

            double mult = oneValue * twoValue;

            JOptionPane.showMessageDialog(null,"A multiplicação dos valores é: " + mult);
     }
}
