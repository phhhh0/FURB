import javax.swing.JOptionPane;

public class Uni4Exe02 {
    public static void main(String[] args) {
        
                float vlr   = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um Número: "));


                if(vlr % 2 == 0){

                JOptionPane.showMessageDialog(null,"O número é par: "+ vlr);
            } else { 
                JOptionPane.showMessageDialog(null,"O número é impar: "+ vlr);
            }

    }
}
