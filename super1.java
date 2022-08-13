class father{
    father(){
        System.out.println("He is a businessman");
    }
}
class son5 extends father{
    son5(){
        super();
        System.out.println("I am also able to discuss how to prevent a business");
    }
}
public class super1 {
    public static void main(String[] args) {
        new son5();   
    }
}
