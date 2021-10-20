import java.io.*;
class SUBTASK {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            String[] in = br.readLine().split(" ");
            int n= Integer.parseInt(in[0]);
            int m= Integer.parseInt(in[1]);
            int k= Integer.parseInt(in[2]);
            int[] arr = new int[n];
            in = br.readLine().split(" ");
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            int sum=0;
            int ans=0;
            for (int i : arr) {
                sum+=i;
            }
            if (sum==n) {
                ans=100;
                System.out.println(ans);continue;
            }
            ans=k;
            for (int i = 0; i < m; i++) {
                if (arr[i]!=1) {
                    ans=0;break;
                }
            }
            System.out.println(ans);
        }
    }
}
