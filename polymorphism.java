class xyz{
    public int sum(int a,int b){
       return a+b;
    }
    public double sum(double a,double b){
        return a*b;
    }
}
class polymorphism{
    public static void main(String[] args) {
        xyz s1=new xyz();
        System.out.println(s1.sum(10, 20));
        System.out.println(s1.sum(30, 50));
    }
}