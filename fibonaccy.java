import java.util.Scanner;

public class fibonaccy {
    static int calculateSum(int n){
        if (n <= 0)
            return 0;
        int[] fibo=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
        int sum = fibo[0] + fibo[1];
        for (int i=2; i<=n; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }
        return sum;
    }
    void display(){
        int n;
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.print("Please Enter Number:");
            n = myObj.nextInt();
        }
        System.out.println("Sum of Fibonacci" + " numbers is : "+ calculateSum(n));
        }
}