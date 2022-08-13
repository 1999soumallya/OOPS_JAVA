import java.util.Scanner;
class bank{
    int account_number;
    double avalable_balence=10000;
    double deposide_amount;
    double current_balence;
    Scanner sc=new Scanner(System.in);
    bank(){
        System.out.print("The account number is: ");
        account_number=sc.nextInt();
        System.out.println("The avalable is: "+avalable_balence);
        System.out.print("The deposited amonut wil be: ");
        deposide_amount=sc.nextDouble();
        current_balence=(avalable_balence+deposide_amount);
        System.out.println("Current balence is "+current_balence);
    }
}
class withdrawn extends bank{
    double withdrawn_amount;
    withdrawn(){
        System.out.println("The account number is: "+super.account_number);
        System.out.println("The avalable balence in "+super.account_number+" is: "+super.current_balence);
        System.out.print("The withdrawn amount is: ");
        withdrawn_amount=sc.nextDouble();
        super.current_balence=(super.current_balence-withdrawn_amount);
        System.out.println("The avalable balance is: "+super.current_balence);
    }
}
public class program1 {
    public static void main(String[] args) {
     new withdrawn();
 }   
}
