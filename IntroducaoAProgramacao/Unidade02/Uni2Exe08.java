import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Uni2Exe08 {
    public static void main(String[] args) {
        
      int codPeca = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código da peça: "));

      int nPeca = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de peças: "));

      int valPeca = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da peça: "));

      int codPeca2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o código da peça: "));

      int nPeca2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de peças: "));

      int valPeca2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor da peça: "));


      int sum = (nPeca * valPeca) + (nPeca2 * valPeca2);

      JOptionPane.showMessageDialog(null,"O Valor Total Será R$ "+sum);
    }
}
