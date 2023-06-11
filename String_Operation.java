import javax.swing.JOptionPane;
import java.util.Locale;

public class String_Operation {
    public static void main(String[] args) {
        String text;
        text=JOptionPane.showInputDialog("input text");
        JOptionPane.showMessageDialog( null,"Register Up\n"+text.toUpperCase(Locale.ROOT));
        JOptionPane.showMessageDialog( null,"Register Down\n"+text.toLowerCase(Locale.ROOT));
        JOptionPane.showMessageDialog( null,"First Char\n"+text.charAt(0));
        JOptionPane.showMessageDialog( null,"Last Char\n"+text.charAt(text.length()-1));
    }
}
