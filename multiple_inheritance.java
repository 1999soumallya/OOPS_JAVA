class base1{
    int a,b,c;
    base1(int x,int y){
        a=x;
        b=y;
    }
    void putdata(){
        c=a+b;
        System.out.println("The total value of base class is = "+c);
    }
}
interface base2{
    int d=20;
    void getdata();
}
class child extends base1 implements base2{
    int e,f;
    child(int x, int y,int z) {
        super(x, y);
        e=z;
    }
    public void getdata(){
        System.out.println("The value of d is ="+d);
    }
    void display(){
        f=a+b+d+e;
        System.out.println("The total value is ="+f);
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        child c=new child(20,50,30);
        c.getdata();
        c.display();
    }
}
