import java.util.*;
import java.io.*;
class CLESEQ {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0){
            t--;
            String in[] = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int k = Integer.parseInt(in[1]);
            String[] arr = br.readLine().split(" ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(arr[i]);
            }
            for (int i = 1; i <= k; i++) {
                int ugly = 0;
                int diff= 1;
                for (int j = 1; j < arr1.length; j++) {
                    int prev = arr1[j-diff];
                    if(arr1[j]==i){
                        diff++;
                        continue;
                    }
                    diff=1;
                    if(prev!=arr1[j]) ugly++;
                }
                if (i==1) {
                    System.out.print(ugly-1+" ");continue;
                }
                System.out.print(ugly+" ");
            }
            System.out.println();
        }
    }
}
