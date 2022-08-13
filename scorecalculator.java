import java.util.Random;
import java.util.Scanner;

class player1{
    int id;
    static int skillValue,placeValue;
    double score;
    String name;
    Scanner sc=new Scanner(System.in);
    player1(){
        System.out.print("Enter the name of first player: ");
        name = sc.next();
        System.out.print("Enter the name of first player id: ");
        id =sc.nextInt();
        skillValue = 5;
        placeValue = 8;
    }
    void calculate(){
        Random random =new Random();
        int randomvalue = random.nextInt(10);
        System.out.println("The random value is: "+randomvalue);
        System.out.print("Enter the value between 0 to 10");
        int inputvalue = sc.nextInt();
        if (inputvalue == randomvalue){
            score = (skillValue * 0.5) + (placeValue *0.6) + inputvalue;
        }
        else {
            score = (skillValue * 0.5) + (placeValue *0.6);
        }
    }
}





public class scorecalculator {
    public static void main(String[] args) {
        player1 obj = new player1();
        obj.calculate();
    }
}
