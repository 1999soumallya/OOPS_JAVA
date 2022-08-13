class abc2 {
    int d;
    int e;
    int a;
    void insert(int b,int h){
        d=b;
        System.out.println("The value of b is="+b);
        e=h;
        System.out.println("The value of h is="+h);
    }
    void calculate(){
        a=(d*e)/2;
    }
    void display(){
        System.out.println("The area is="+a);
    }
}
class area{
    public static void main(String[] args){
        abc2 obj=new abc2();
        obj.insert(4,13);
        obj.calculate();
        obj.display();
    }
}
