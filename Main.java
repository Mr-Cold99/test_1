import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String title="привіт";
        String text="Такий собі Hello Word!";
        JOptionPane.showMessageDialog(
                null,
                text,
                title,
                JOptionPane.PLAIN_MESSAGE

        );
    }

}
