import java.util.*;
import java.io.*;
class MKGPLNKS {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            t--;
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split("");
            int minGrp = 0;
            for(int i = 1;i<n;i++)
            {
                if(arr[i].charAt(0)==arr[0].charAt(0)) continue;
                else if(arr[i].charAt(0)==arr[i-1].charAt(0)) continue;
                else minGrp++;
            }
            System.out.println(minGrp);
        }
    }
}
