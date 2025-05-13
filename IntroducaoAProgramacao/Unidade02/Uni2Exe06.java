import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Uni2Exe06 {
    public static void main(String[] args) {
        
        int nFunc = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o Nº do Funcionário: "));

        int hrsTab = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Horas Trabalhadas: "));

        int vlrHr = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o Valor por Hora: "));

        int calc = hrsTab * vlrHr;

        DecimalFormat df = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null,"O funcionário vai receber: " + df.format(calc));
    
        
    }
}
