import java.io.*;
import java.util.*;
class FILL01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String[] arr = br.readLine().split("");
            int[]  ar = new int[n];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = Integer.parseInt(arr[i]);
            }
            int count = 0,lc=0;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i]==1){
                    lc=0;
                    continue;
                }
                if(ar[i] ==0) lc++;
                // System.out.println(ar[i]+""+lc+""+count);
                if(lc>=k) {
                    count++;
                    lc=0;
                }
            }
            System.out.println(count);
        }

    }
}
