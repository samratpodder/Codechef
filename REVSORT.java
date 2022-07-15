import java.util.*;
class REVSORT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int tSum =0, lsum = arr[0], start =0, end =0;
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if(arr[i]<=arr[i-1])
                {
                    sorted = false;
                    end = i;
                    lsum+=arr[i];
                }
                else{
                    lsum=arr[i];
                    start=i;
                    end=i;
                }
                tSum = Math.max(lsum,tSum);
            }
            if(sorted||tSum<=x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
