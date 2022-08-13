class Dog1{
    void braking(){
        System.out.println("The dog is barking");
    }
}
interface puppy{
    void cute();
}
class BabyDog1 extends Dog1 implements puppy{
    void bark(){
        System.out.println("Baby dog is barking");
    }
    public void cute(){
        System.out.println("Puppy is cute");
    }
}
public class Multipal {
    public static void main(String[] args) {
        BabyDog1 bd = new BabyDog1();
        bd.bark();
        bd.braking();
        bd.cute();
    }
}