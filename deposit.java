class dep{
    int balance=0;
    int deposit=0;
    int amount;
    void add(int inictialbalance,int newbalance){
        balance=inictialbalance;
        deposit=newbalance;
    }
    void total(){
        amount=balance+deposit;
        System.out.println("The balance is = "+amount);
    }
}
public class deposit {
    public static void main(String[] args) {
        dep Ankit=new dep();
        Ankit.add(1000, 2000);
        Ankit.total();
        dep Akash=new dep();
        Akash.add(2000, 3000);
        Akash.total();
    }
}
