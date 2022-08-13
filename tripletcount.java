public class tripletcount {
    static int LargerElementLowerIndex(int[] arr,int n){
        int coun=0;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++){
                    if (arr[i]>arr[j] && arr[i]>arr[k] && arr[j]>arr[k]){
                        coun++;
                    }
                }
        return coun;
    }
    public static void main(String[] args) {
        int arr[]={8,4,6,4,2};
        int n = arr.length;
        System.out.println("The total count is: "+LargerElementLowerIndex(arr,n));
    }
}
