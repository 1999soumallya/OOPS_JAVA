class over{
    double length;
    double breadth;
    over(double d,double e){
        length=d;
        breadth=e;
    }
    protected over(double c){
        length=breadth=c;
    }
    void display(){
        System.out.println(length*breadth);
    }
}
class methodoverloading{
    public static void main(String[] args) {
        over o1= new over(25.0,15.0);
        over o2= new over(25.0);
        o1.display();
        o2.display();
    }
}