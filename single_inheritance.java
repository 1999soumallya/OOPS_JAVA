import java.util.Scanner;
class base{
    int c; int a; int b;
    Scanner sc=new Scanner(System.in);
    public void display(){
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        c=a+b;
        System.out.println("The result is= "+c);
    }
}
class son extends base{
    int e;
    void display1(){
        System.out.print("Enter the value of d: ");
        int d=sc.nextInt();
        e=(super.c+d);
        System.out.println("The result is= "+e);
    }
}
class single_inheritance{
    public static void main(String[] args) {
        son obj1=new son();
        obj1.display();
        obj1.display1();
    }
}