import java.util.*;
import java.io.*;
class REMONE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            t--;
            int n = Integer.parseInt(br.readLine());
            String[] ain = br.readLine().split(" ");
            String[] bin = br.readLine().split(" ");
            int[] a = new int[n+1];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(ain[i]);
            }
            for (int i = 0; i < n-1; i++) {
                b[i] = Integer.parseInt(bin[i]);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            if (n==2) {
                if(b[0]>a[1])
                {
                    System.out.println(b[0]-a[1]);
                }
                else
                {
                    System.out.println(b[0]-a[0]);
                }
            }
            else{
                if(b[0]-a[0] == b[n-2]-a[n-2])
                {
                    System.out.println(b[0]-a[0]);
                }
                else{
                        if(b[0]-a[1] == b[n-2]-a[n-1])
                    {
                        System.out.println(b[0]-a[1]);
                    }
                    else{
                        System.out.println(b[0]-a[0]);
                    }
                }
                
            }
        }
    }
}
