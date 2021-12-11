import java.io.*;
import java.util.*;
class INDIPERM {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int n = Integer.parseInt(br.readLine());
            System.out.print(n+" ");
            for (int i = 1; i < n; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
