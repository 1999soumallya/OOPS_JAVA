class instructor1 extends person1{
    int id;
    int salary;
    instructor1(int id,int salary,String n,int birth){
        super(n,birth);
        this.id=id;
        this.salary=salary;
        System.out.println(id+" "+salary+" "+super.toString());
    }
}
