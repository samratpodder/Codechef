import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class  HCAGMAM1{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            String[] str = br.readLine().split("");
            int[] arr = new int[str.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int worked =0;
            int streak=0, globalmax=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==1) {
                    worked++;
                    streak++;
                }
                if (arr[i]==0) {
                    streak=0;
                }
                
                globalmax = Math.max(globalmax,streak);
            }
            System.out.println((globalmax*y)+(worked*x));
        }
    }
}
