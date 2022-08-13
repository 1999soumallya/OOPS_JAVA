import java.util.Scanner;
class education{
    int m1,m2,m3,m4,m5,total;
    float avarage;
    void setdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first subject marks : ");
        m1 = sc.nextInt();
        System.out.println("Enter second subject marks : ");
        m2=sc.nextInt();
        System.out.println("Enter thered subject marks : ");
        m3 = sc.nextInt();
        System.out.println("Enter fourth subject marks : ");
        m4=sc.nextInt();
        System.out.println("Enter fifth subject marks : ");
        m5 = sc.nextInt();
        sc.close();
    }
    void getdata(){
        total=(m1+m2+m3+m4+m5);
        System.out.println("Parcentage of a marks is :"+total);
        avarage=total/5;
        System.out.println("Parcentage of a marks is :"+avarage+"%");
        if(avarage>=90.00){
            System.out.println("The grade is A");
        }
        if(avarage>=70.00){
            System.out.println("The grade is B");   
        }
        if (avarage>=50.00) {
            
        }
        else {
            System.out.println("The student is fail");   
        }
    }
}
public class studentexam{
    public static void main(String[] args) {
        education obj1=new education();
        obj1.setdata();
        obj1.getdata();    
    }
}