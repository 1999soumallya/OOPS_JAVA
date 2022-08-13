import java.util.Scanner;

class mindistance
{
    int minDist(int[] arr, int n, int x, int y)
    {
        int p=-1;
        int min_dist=Integer.MAX_VALUE;

        for(int i=0 ; i<n ; i++)
        {
            if(arr[i] ==x || arr[i] == y)
            {
                if(p != -1 && arr[i] != arr[p]) {
                    min_dist = Math.min(min_dist,i-p);
                }
                p=i;
            }
        }
        if(min_dist==Integer.MAX_VALUE)
            return 0;
        return min_dist;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mindistance min = new mindistance();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Minimum distance between " + x + " and " + y + " is " + min.minDist(arr, n, x, y));
        sc.close();
    }
}
