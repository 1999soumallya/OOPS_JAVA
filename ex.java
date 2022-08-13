class demo{
    int val1=10;
    int val2=20;
    demo(){
        val1=110;
        val2=220;
        System.out.println("This is default constructor which is fatch the value that is declare in the constructor ");
    }
    demo(int a){
        val1=a;
        System.out.println("This is parametarize constructor which is fatch one valu that is declare in the constructor and fatch and another value from global veriable");
    }
    demo(int a,int b){
        val1=a;
        val2=b;
        System.out.println("This is parametarize constructor which is fatch all values  from global veriable ");
    }
    void display(){
        System.out.println(val1);
        System.out.println(val2);
    }
}
public class ex {
    public static void main(String[] args) {
        demo d1=new demo();
        d1.display();
        demo d2=new demo(30);
        d2.display();
        demo d3=new demo(30,40);
        d3.display();
    }
}
