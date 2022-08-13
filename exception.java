import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class ran{
    Random random=new Random();
    Scanner sc = new Scanner(System.in);
    private int divisor;
    ran(){
        System.out.print("Enter the min number :");
        int min =sc.nextInt();
        System.out.print("Enter the max number :");
        int max =sc.nextInt();
        int divident[]=new int[10];
        for (int i=0;i<divident.length;i++){
            //divident[i]=min+random.nextInt(max);
            divident[i]=ThreadLocalRandom.current().nextInt(min,max);
        }
        for(int i=0;i<divident.length;i++){
            System.out.print(divident[i]+" ");
        }
        System.out.print("Enter the divisor :");
        divisor = random.nextInt(5);
        System.out.println("The divisor is"+divisor);
        System.out.print("Enter the index");
        int index = sc.nextInt();
        float result= divident[index]/divisor;
        System.out.println(result);
    }
}
public class exception extends Throwable {
    public static void main(String[] args) {
        try {
            new ran();   
        } catch (Exception e) {
            System.out.println("The number is invalid");
        }
    }
}