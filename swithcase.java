import java.util.Scanner;

public class swithcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int age = sc.nextInt();
        switch (number){
            case 1:
                if (age >= 18 && age <= 59){
                    System.out.println("Adult Person");
                }
                break;
            case 2:
                if (age >= 60) {
                    System.out.println("Senior Citizen");
                }
                break;
            case 3:
                if (age <= 10){
                    System.out.println("Children");
                }
                break;
            default:
                break;
        }
    }
}
