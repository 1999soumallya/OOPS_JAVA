class  sou{
    int a;
    int b;
    void setdeta(int x, int y){
        a = x;
        b = y;
    }
    void add(){
        int c = a+b;
        System.out.println("The result is: "+c);
    }
}

public class addition {
    public static void main(String[] args) {
        sou s = new sou();
        s.setdeta(20, 30);
        s.add();
    }
}
