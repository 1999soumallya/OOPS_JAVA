import java.util.Scanner;
public class Manudriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Fibonacci.");
        System.out.println("Enter 2 for Rectangle.");
        System.out.println("Enter 3 for exit");
        lp :while (true)
        {
            System.out.print("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    fibonaccy obj = new fibonaccy();
                    obj.display();
                    break;
                case 2:
                    try {
                        int length;
                        int breadth;
                        Scanner input = new Scanner(System.in);
                        System.out.print("Enter the value of Length: ");
                        length = input.nextInt();
                        System.out.print("Enter the value of Breadth: ");
                        breadth = input.nextInt();
                        if (length < 0 || breadth < 0) {
                            throw new Exception("No negative value is allowed");
                        } else {
                            int area = length * breadth;
                            System.out.println("Area of the Rectangle is: " + area);
                        }
                        input.close();
                    } catch (Exception e) {
                        System.out.println("No negative value is allowed");
                    }
                    break;
                case 3:
                    break lp;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
        sc.close();
    }
}