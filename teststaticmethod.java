class student1{
    int rollno;
    String name;
    static String college="ITS";
    void display(){
        college="BCREC";
        System.out.println("The college name is "+college);
    }
    student1(int r,String n){
        rollno=r;
        name=n;
        System.out.println(n);
        System.out.println(r);
    }
}


public class teststaticmethod {
    public static void main(String[] args) {
        student1 obj1=new student1(0, null);
        obj1.display();
    }
}
