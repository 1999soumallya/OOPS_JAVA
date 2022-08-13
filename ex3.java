class employee2{
    double salary;
    double DA;
    employee2(){
        DA=(DA*10);
        salary=(salary+DA);
    }
    void display(String TOH){
        System.out.println("Salary for"+TOH+"Net salary"+salary);
    }
}
class employees1 extends employee2{
    double bonus;
    double TA;
    employees1(){
        
    }
}


public class ex3 {
    public static void main(String[] args) {
        new employees1();
    }
}
