import java.util.Scanner;
class program3{
    int min_year = 1999;
    int max_year = 2999;
    static Scanner sc=new Scanner(System.in);
    static int day;
    static int m;
    static int year;
    program3(){
        System.out.print("Enter the day: ");
        day = sc.nextInt(); 
        System.out.print("Enter the mounth: ");
        m = sc.nextInt();
        System.out.print("Enter the year: ");
        year = sc.nextInt();
    }
    boolean ValidDate(){
        if(year<=max_year || year>=min_year){    
            for(m=1;m<=12;m++){
                if (m == 4 || m == 6 || m == 9 || m == 11){
                    return day<=30;
                }
                if (m==1 || m==3 || m==5 || m==7 || m==8|| m==10 || m==12){
                    return day<=31;
                }
                if(m==2){
                    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
                        return (day<=29);
                    else
                        return (day<=28);
                }
            }
            return true;
        }
        return false;
    }
    void check(){
        if (m == 4 || m == 6 || m == 9 || m == 11){
            if(day>30){
                day=1;
                m=m+1;
                System.out.println("The next valid day is: "+day+" : "+m+" : "+year);
            }
            else{
                if(day<30){
                    System.out.println("The next valid day is: "+(day+1)+" : "+m+" : "+year);
                }
            }
        }
        if (m==1 || m==3 || m==5 || m==7 || m==8|| m==10){
            if(day>31){
                day=1;
                m=m+1;
                System.out.println("The next valid day is: "+day+" : "+m+" : "+year);
            }
            else{
                if(day<31){
                System.out.println("The next valid day is: "+(day+1)+" : "+m+" : "+year);
                }
            }
        }
        if(m==12){
            if(day>31){
                day=1;
                m=1;
                year=year+1;
                System.out.println("The next valid day is: "+day+" : "+m+" : "+year);
            }
            else{
                if(day<31){
                System.out.println("The next valid day is: "+(day+1)+" : "+m+" : "+year);
                }
            }
        }
        if(m==2){
            if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                if(day>29){
                    day=1;
                    m=m+1;
                    System.out.println("The next valid day is: "+day+" : "+m+" : "+year);
                }
                if(day<29){
                    System.out.println("The next valid day is: "+(day+1)+" : "+m+" : "+year);
                }
            }
            else{
                if(day>28){
                    day=1;
                    m=m+1;
                    System.out.println("The next valid day is: "+day+" : "+m+" : "+year);
                }
                else{
                    if(day<28){
                        System.out.println("The next valid day is: "+(day+1)+" : "+m+" : "+year);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        program3 d=new program3();
        d.check();
        if(d.ValidDate()){
            System.out.println("The day is valid");
        }
        else{
            System.out.println("The day is not valid");
        }
    }
}