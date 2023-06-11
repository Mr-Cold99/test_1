import javax.swing.JOptionPane;
public class Data_types {
    public static void main(String[] args) {
        int a,b;
       double c;
        String input;
        input=JOptionPane.showInputDialog("input a");
        a=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("input b");
        b=Integer.parseInt(input);
        c=a+b;
        JOptionPane.showMessageDialog(null, "Suma a&b "+c);
        c=a-b;
        JOptionPane.showMessageDialog(null,"Riznytsa a&b "+c);
        c=a*b;
        JOptionPane.showMessageDialog(null,"Dobutok a&b "+c);
        double d=a,e=b;
        c=d/e;
        JOptionPane.showMessageDialog(null,"Chastka a&b "+c);
        System.out.println(c);
    }
}