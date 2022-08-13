class AreaOfRectangle {
  int length;
  int breadth;
  int area(){
    int x= length * breadth;
    System.out.println("Area of Rectangle is:"+x);
    return x;
  
  }
  void set(int l, int b){
    length=l;
    breadth=b;
  }
  void disp(int a){
    System.out.println("Area of Rectangle is:"+a);
  }
}
class rect{
   public static void main (String[] args){
	   AreaOfRectangle r = new AreaOfRectangle();
	   int a;
	   r.set(10,20);
	   a=r.area();
	   r.disp(a);
   }

}