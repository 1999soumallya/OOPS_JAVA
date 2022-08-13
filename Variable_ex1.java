class abc6{
    int a=10;
    static int b=2;
    void add(){
        int c=30;
        int d=a+b+c;
        System.out.println(d);
    }
    void mul(){
        int e=22;
        int f=a*b*e;
        System.out.println(f);
    }
}
public class Variable_ex1{
    public static void main(String[] args) {
        abc6 obj = new abc6();
        obj.add();
        obj.mul();
    }
}