import java.util.*;
class ARRAYRET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLong();
                sum+=arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]-sum/(n+1));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
