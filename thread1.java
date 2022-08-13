import java.lang.Thread;
class mythread extends Thread{
    public void run(){
        int i=0;
        while (i<10) {
            System.out.println("My java program is executing");
            System.out.println("I am happy!");
            i++;
        }
    }
}
class mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("My python program is showing an error");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        mythread t1=new mythread();
        mythread1 t2=new mythread1();
        t1.start();
        t2.start();
    }
}