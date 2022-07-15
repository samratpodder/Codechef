import java.util.*;
class PAIREQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            // int candidate = arr[0], trust = 1;
            // for(int i = 1;i<n;i++)
            // {
            //     if(candidate == arr[i]) trust++;
            //     else{
            //         trust--;
            //         if(trust==0)
            //         {
            //             candidate = arr[i];
            //             trust = 1;
            //         }
            //     }
            // }
            // trust = 0;
            // for (int i = 0; i < n; i++) {
            //     if(candidate == arr[i]) trust++;
            // }
            int trust=0,maxT =0;
            for(int i = 1;i<n;i++)
            {
                if(arr[i]==arr[i-1]) trust++;
                else trust=0;
                maxT = Math.max(maxT,trust);
            }
            if(n== maxT) System.out.println(0);
            System.out.println(n-maxT-1);
        }
    }    
}
