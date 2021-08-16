import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class ARRFILL {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            long[] arr = new long[n];
            int m = Integer.parseInt(input[1]);
            while(m-->0)
            {
                input = br.readLine().split(" ");
                long x = Long.parseLong(input[0]);
                long y = Long.parseLong(input[1]);
                for (int i = 0; i < n; i++) {
                    if ((i+1)%y!=0 && x>arr[i]) {
                        arr[i] = x;
                    }
                }
            }
            long sum =0;
            for (long i : arr) {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
