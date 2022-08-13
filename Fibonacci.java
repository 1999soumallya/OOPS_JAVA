import javax.swing.JOptionPane;
public class Fibonacci
{
    public static void main(String[] args)
    {
        String num = JOptionPane.showInputDialog("Enter a number: ");
        int n = Integer.parseInt(num);
        Fibonacci1 box = new Fibonacci1();
        JOptionPane.showMessageDialog(null,"That Fibonacci Number is " + box.Fib(n));
    }
}
