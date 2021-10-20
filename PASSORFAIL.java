import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PASSORFAIL {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int x = Integer.parseInt(in[1]);
            int p = Integer.parseInt(in[2]);
            if ((x*3)+((n-x)*-1)>=p && x>0) {
                System.out.println("PASS");
            }
            else
            System.out.println("FAIL");
        }
    }
}
