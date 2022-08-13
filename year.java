import java.util.Scanner;

public class year {
   public static void main(String[] args){
      check c1=new check();
      c1.c();
    }
}
class check{
    Scanner sc = new Scanner(System.in);
    int day=sc.nextInt();
    int m=sc.nextInt();
    int year=sc.nextInt();
    void c(){
        if(m==2){
            if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                if(day>29){
                    day=1;
                    m=m+1;
                    System.out.println("The valid day is: "+day+" : "+m+" : "+year);
                }
                if(day<29){
                    System.out.println("The next day is: "+(day+1)+" : "+m+" : "+year);
                }
            }
            else{
                if(day>28){
                    day=1;
                    m=m+1;
                    System.out.println("The valid day is: "+day+" : "+m+" : "+year);
                }
                else{
                    if(day<28){
                        System.out.println("The next day is: "+(day+1)+" : "+m+" : "+year);
                    }
                }
            }
        }
    }
}  