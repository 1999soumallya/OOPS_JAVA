class s{
    int rollno;
    String name;
    static String college="BCREC";
    s(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class student {
    public static void main(String[] args) {
        s s1=new s(111,"ABC");
        s s2=new s(222,"PQR");
        s1.display();
        s2.display();
    }
}
