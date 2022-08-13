class employees{
    double salary=10000;
    double DA=700;
    double TA=500;
    double Bonus=2000;
    double result;
    employees(){
        DA=(DA*10);
        result=(salary+DA);
    }
    void display(){
        System.out.println("The base salary is :"+result);;
    }
}
class employees2 extends employees{
    void display1(){
        System.out.println("Tha salary of Manager is"+result);
        System.out.println("Tha salary of programer is"+result);
    }
}
class Analyst extends employees{
    void display3(){
        System.out.println("The salary of Anamlyst is :"+(result+Bonus));
    }
}
class Housekeeping extends employees{
    void display4(){
        TA=(TA*10);
        System.out.println("The salary of Housekeeping is :"+(result+TA));
    }
}
public class ex2{
    public static void main(String[] args) {
        employees2 obj6=new employees2();
        obj6.display1();
        Analyst obj8=new Analyst();
        obj8.display3();
        Housekeeping obj9=new Housekeeping();
        obj9.display4();
    }
}