class counter{
    static int count=0;
    counter(){
        count++;
        System.out.println(count);;
    }
}

public class ex1 {
    public static void main(String[] args) {
    new counter();
    new counter();
    new counter();
    }
}
