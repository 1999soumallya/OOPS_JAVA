import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            if (age >= 18 && age <= 59){
                System.out.println("Adult Person");
            } else if (age >= 60) {
                System.out.println("Senior Citizen");
            } else if (age == 0) {
                break;
            } else {
                System.out.println("Children");
            }
        }
    }
}
