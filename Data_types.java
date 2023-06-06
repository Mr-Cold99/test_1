import javax.swing.JOptionPane;
public class Data_types {
    public static void main(String[] args) {
        int a,b,c;
        String input;
        input=JOptionPane.showInputDialog("input a");
        a=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("input b");
        b=Integer.parseInt(input);
        c=a+b;
        JOptionPane.showMessageDialog(null, "Suma a&b "+c);
        c=a-b;
        JOptionPane.showMessageDialog(null,"Rrznytsa a&b "+c);
        c=a*b;
        JOptionPane.showMessageDialog(null,"Dobutok a&b "+c);
        c=a/b;
        JOptionPane.showMessageDialog(null,"Chastka a&b "+c);
    }
}