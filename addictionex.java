
public class addictionex{
    static void result(int a,int b,int c) throws Exception{
        if (c==0){
            System.out.println("The result is "+(a+b+c));
        }
        else{
            throw new Exception();
        }
    }
    public static void main(String[] args) {
        try {
           result(10, 20, 30);
        } catch (Exception e) {
            System.out.println("Enter a valid number ");
        }
    }
}