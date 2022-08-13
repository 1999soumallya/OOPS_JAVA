public class array {
    public static void main(String[] args) {
        double p=2;
        double[] arr={0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i<=arr.length;i++){
            arr[i]=Math.pow(arr[i],p);
            System.out.println(arr[i]);
        }
    }    
}