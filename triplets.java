public class triplets {
    static int CountTriplets(int arr[], int n)
    {
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                    if (arr[k] < arr[i] && arr[i] < arr[j])
                        {
                            cnt += 1;
                        }
        return cnt;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{ 2, 5, 1, 3, 0 };
        int n = arr.length;
        System.out.print(CountTriplets(arr, n));
    }
}
