import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class CHFINVNT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            String[] input = br.readLine().split(" ");
            int N= Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);
            float K = Integer.parseInt(input[2]);
            int count=0;
            if (p%K==0) {
                System.out.println(2);
                continue;
            }
            for (int i = 0; i < K ; i++) {
                if (i==p%K) {
                    count+=Math.ceil(p/K);
                    System.out.println(count);
                } else {
                    count+=N/K;
                }
            }
        }
    }
}
