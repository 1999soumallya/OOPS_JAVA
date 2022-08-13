public class UncomonSum {
    static void printUncommon(int[] arr1, int[] arr2, int n1, int n2){
        int i=0, j=0 ,sum = 0;
        while (i < n1 && j < n2){
            if (arr1[i] < arr2[j]){
                sum = sum + arr1[i];
                i ++;
            }
            else {
                i++;
                j++;
            }
        }
        while (i < n1){
            i++;
        }
        while (j < n2){
            sum = sum + arr2[j];
            j++;
        }
        System.out.println("The sum is:"+sum);
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7};
        int[] arr2 = {4,6,7,8,9,15};

        int n1 = arr1.length;
        int n2 = arr2.length;
        printUncommon(arr1, arr2, n1, n2);
    }
}
