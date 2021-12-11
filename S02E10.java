import java.io.*;
import java.util.*;
class S02E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n], b = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < b.length&&x>0; i++) {
                if(Math.abs(a[i]-b[i])<=k)
                {
                    x--;

                }
            }
            if(x>0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
