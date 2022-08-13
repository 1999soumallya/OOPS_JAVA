import java.util.Scanner;
class abc1 {
    int a,b,c;
    void display(){
        Scanner ab =new Scanner(System.in);
        System.out.println("The value of a is :");
        a=ab.nextInt();
        System.out.println("The value of b is :");
        b=ab.nextInt();
        ab.close();
    }
    void div(){
        c=a/b;
        System.out.println("The divistion is :="+c);
    }
}
class divistion {
    public static void main(String[] args) {
        abc1 obj1=new abc1();
        obj1.display();
        obj1.div();
    }
}