class con{
    int a;
    int b;
    con(){
        a=20;
        b=30;
        System.out.println("I am default Constructor");
    }
    con(int x,int y){
        a=x;
        b=y;
        System.out.println("I am parameterize Constructor");
    }
    con(int l){
        a=b=l;
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
public class constructor {
    public static void main(String[] args) {
        con a1=new con();
        a1.display();
        con a2=new con(10, 20);
        a2.display();
        con a3=new con(40);
        System.out.println("This is constructor ovrloading: "+a3.a+" "+a3.b);
    }
}
