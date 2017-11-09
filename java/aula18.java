import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {
        try {
            int num = Integer.valueOf(
                    JOptionPane.showInputDialog(null, "Informe o numero", "calcular dobro", JOptionPane.INFORMATION_MESSAGE));
            JOptionPane.showMessageDialog(null,"O dobro e " + num*2, "resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Formato invalido", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
