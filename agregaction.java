class person{
    String name="Soumallya";
    String YOB="16.Dec.1999";
    person(){
        System.out.println(name+" "+YOB);
    }
}
class student3{
    int rollno=63;
    String stream="M.C.A";
    person p;
    student3(){
        p=new person();
        System.out.println(rollno+" "+stream+" "+p.name+" "+p.YOB);
    }
}
class instructor{
    int id=1;
    int salary=5000;
    person p;
    instructor(){
       p=new person();
       System.out.println(id+" "+salary+" "+p.name+" "+p.YOB);
    }
}
public class agregaction {
    public static void main(String[] args) {
        new student3();
        new instructor();
    }
}
