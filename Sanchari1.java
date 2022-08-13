public class Sanchari1 {
    public static int IceCream(int radius, int height){
        return (int) ((Math.pow(radius,2))*((2*radius)+height));
    }
    public static void main(String[] args) {
        int radius = 7;
        int height = 7;
        System.out.print("The Quantity is: "+IceCream(radius, height));
    }
}
