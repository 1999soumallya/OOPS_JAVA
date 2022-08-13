class person4{
    private double base;
    private double ta;
    private String name,catagory;
    double calculate;
    person4(String name,String catagory,double base,double ta){
        this.name=name;
        this.catagory=catagory;
        this.base=base;
        this.ta=ta;
    }
    public void cal_salary(){
        calculate=base+ta;
    }
    public void display(){
        System.out.println("The name of a person: "+name);
        System.out.println("The name of a person: "+catagory);
        System.out.println("The salary is: "+calculate);
    }
}
class politician1 extends person4{
    politician1(String name,String catagory,double base,double ta){
        super(name,catagory,base,ta);
        super.cal_salary();
    }
}
class sportman extends person4{

    sportman(String name, String catagory, double base, double ta) {
        super(name, catagory, base, ta);
        super.cal_salary();
    }

}
public class program2{
    public static void main(String[] args) {
        politician1 p=new politician1("Ajay","politician",120000,20000);
        p.display();
        System.out.println("In the second case");
        person4 s=new sportman("Dhoni", "Spotman", 2000000, 120000);
        s.display();
    }
}