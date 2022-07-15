import java.util.*;
class firstandlast{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int l=0;
            int r=n-1;
            int count=0;
            int res = -1;
            while(count<n)
            {

                res = Math.max(res,arr[l]+arr[r]);
                l=(l+1)%n;
                r=(r+1)%n;
                count++;
            }
            System.out.println(res);
        }
    }
}