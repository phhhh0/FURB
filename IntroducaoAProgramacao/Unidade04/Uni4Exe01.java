import javax.swing.JOptionPane;

public class Uni4Exe01 {
    public static void main(String[] args) {
      
        float hrsMes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o total de horas no mês: "));

        float hrsval   = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor pago por hora: "));

        float salTot = hrsMes * hrsval;

        if(hrsMes > 160){

            float salExtra =  (hrsMes - 160) * (hrsval / 2);

            salTot = salTot + salExtra;
        }

        JOptionPane.showMessageDialog(null,"O salário total é: " + salTot);

    }
}