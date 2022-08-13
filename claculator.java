import java.util.Scanner;

class calculate{
    public static void main(String[] args) {
        double a,b;
        char operaction;
        Scanner sc=new Scanner(System.in);
        System.out.println("The value of a is: ");
        a=sc.nextDouble();
        System.out.println("The value of a is: ");
        b=sc.nextDouble();
        System.out.println("Enter the operaction which is want to parform (+,-,*,/)=");
        operaction=sc.next().charAt(0);
        sc.close();
    switch (operaction){
        case '+':
            System.out.println("The addiction of two value is ="+(a+b)); 
            break;
        case '-':
            System.out.println("The Substrudtion of two value is="+(a-b));
            break;
        case '/':
            System.out.println("The Divistion of two value is="+(a/b));
            break;
        case '*':
            System.out.println("The Multiplication of two value is="+(a*b));
            break;
        default:
            System.out.println("Invalid Operator");
            break;
        }
    }
}