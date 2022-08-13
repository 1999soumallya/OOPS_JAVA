public class PeekElementAddiction {
    static int SumOfPeak(int[] arr, int n){
        int sum = 0;
        if (arr[0] > arr[1]){
            sum = arr[0];
        }
        for (int j =1;j< n-1;j++){
            if (arr[j]>arr[j+1] && arr[j]>arr[j-1]){
                sum = sum+arr[j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr ={13,5,14,12,8,30,15};
        int n = arr.length;
        System.out.println("The total sum of a peek element is: "+SumOfPeak(arr,n));
    }
}
