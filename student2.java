public class student2 extends person1{
    int rollno;
    String stream;
    student2(int rollno,String stream,String n,int birth){
        super(n,birth);
        this.rollno=rollno;
        this.stream=stream;
        System.out.println(rollno+" "+stream+" "+super.toString());
    }
}
