class VariableDemo{
   static int count=0;
   public void increment(){
       count++;
       System.out.println(count);
   }
   void display(){
       System.out.println(count);
   }
   public static void main(String[] args){
       VariableDemo obj1=new VariableDemo();
       VariableDemo obj2=new VariableDemo();
       obj1.display();
       obj1.increment();
       System.out.println("Obj1: count is="+VariableDemo.count);
       System.out.println("Second");
       obj2.display();
       obj2.increment();
       System.out.println("Obj2: count is="+VariableDemo.count);
   }
}
