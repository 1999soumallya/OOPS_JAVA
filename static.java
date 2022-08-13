/*class test{
    static int i=5;
    static int j=9;
    void xyz(){
        int j=5;
        i++;
        System.out.println(i);
    }
    void pqr(){
        int k=5;
        System.out.println("i="+i+"j=" +j+ "k="+k);
    }
}
class satic{
    public static void main(String[] args) {
        test obj1=new test();
        obj1.xyz();
        obj1.pqr();
    }
}*/
class test{
    static int i=5;
    static int j=9;
    public static void xyz(){
        j=5;
        i++;
        System.out.println(i);
    }
    void pqr(){
        int k=5;
        System.out.println("i="+i+"j=" +j+ "k="+k);
    }
}
class satic{
    public static void main(String[] args) {
        test obj1=new test();
        test.xyz();
        obj1.pqr();
    }
}