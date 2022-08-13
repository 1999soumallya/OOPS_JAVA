class base3{
    int a,b,c;
    base3(int x,int y){
        a=x;
        b=y;
    }
    void base(){
        c=a+b;
        System.out.println("Total base value is : "+c);;
    }
}
class second_base3 extends base3{
    int d,e;
    second_base3(int x, int y,int z) {
        super(x, y);
        d=z;
    }
    void second_base(){
        e=a+b+d;
        System.out.println("Total value of second base class : "+e);
    }
}
class child3 extends second_base3{
    int f,g;
    child3(int i,int x,int y,int z){
        super(x, y, z);
        f=i;
    }
    void child(){
        g=a+b+d+f;
        System.out.println("The total value of child class is : "+g);
    }
}
public class multilevel_inheritance {
    public static void main(String[] args) {
        child3 obj1=new child3(90, 80, 70, 60);
        obj1.base();
        obj1.second_base();
        obj1.child();
    }
}
