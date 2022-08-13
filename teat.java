public class teat {
    static int i=5;
    static int j=5;
    static int k=5;
    void xyz(){
        int j=4;
        i++;
        System.out.println(i);
        System.out.println(j);
    }
    void pqr(){
        int k=4;
        System.out.println("i="+i+"j="+j+"k="+k);
    }
    void display()
    {
        System.out.println("i="+i+"j="+j+"k="+k);
    }
    public static void main(String[] args){
        teat s=new teat();
        s.display();
        s.pqr();
        s.xyz();
        s.display();
        teat t=new teat();
        System.out.println("The Second Exequction");
        t.display();
        t.xyz();
        t.pqr();
        t.display();
    }
}
/*public class teat {
    int i=5;
    int j=5;
    int k=5;
    void xyz(){
        int j=4;
        i++;
        System.out.println(i);
        System.out.println(j);
    }
    void pqr(){
        int k=4;
        System.out.println("i="+i+"j="+j+"k="+k);
    }
    void display()
    {
        System.out.println("i="+i+"j="+j+"k="+k);
    }
    public static void main(String[] args){
        teat s=new teat();
        s.display();
        //s.pqr();
        s.xyz();
        s.display();
        teat t=new teat();
        System.out.println("The Second Exequction");
        t.display();
        //t.xyz();
        t.pqr();
        t.display();
    }
}*/
