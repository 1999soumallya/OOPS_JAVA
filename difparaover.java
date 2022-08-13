class example{
    int a;
    int b;
    String c="Hello java";
    example(int x,int y){
        a=x;
        b=y;
        System.out.println("This is paramitarize constructor");
    }
    example(){
        a=20;
        b=30;
        //c="Hello world";
        System.out.println("This is difault constructor");
    }
    example(String d){
        c=d;
        System.out.println("This is constructor overloding");
    }
    void display(){
        System.out.println(a+" "+b);
    }
}
public class difparaover {
    public static void main(String[] args) {
        example obj1=new example();
        obj1.display();
        example obj2=new example(30,40);
        obj2.display();
        example obj3=new example("Welcome java");
        System.out.println(obj3.c);
    }
}
