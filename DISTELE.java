import java.util.*;
import java.io.*;
class DISTELE {
    // public static boolean isRep(int[] arr, int left, int right)
    // {
    //     boolean isR = false;
    //     for (int i = left; i < right; i++) {
            
    //     }
    // }
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int left=0,right=0;
            int ans = 0;
            for (int gap = 1; gap < arr.length; gap++) {
                left=0;
                right=left+gap;
                while (right<=n-1) {
                    
                }
            }
        }
    }
}
