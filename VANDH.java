import java.util.*;
import java.io.*;
class VANDH {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String hills = "010";
            String valls = "101";
            String op = "";
            if(n<m){
                for (int i = 0; i <= n; i++) {
                    op+="10";
                }
                op+="1";
                for (int i = 0; i < m-n-1; i++) {
                    op+=valls;
                }
            }
            else if(n>m){
                for (int i = 0; i < m; i++) {
                    op+="01";
                }
                for (int i = 0; i < n-m; i++) {
                    op+=hills;
                }
            }
            else if(n==m){
                for (int i = 0; i <= m; i++) {
                    op+="01";
                }
            }
            System.out.println(op.length());
            System.out.println(op);
        }
    }
}
