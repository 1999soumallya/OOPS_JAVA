
class Fibonacci1{
    int a=0,b=1,c;
    String num;
    public int Fib(int n){
        for(int i=0;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
        
    }
}