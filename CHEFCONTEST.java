import java.util.*;
import java.io.*;
class CHEFCONTEST{
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            if(x+(p*10)<y+(q*10))
            {
                System.out.println("Chef");
            }
            if(x+(p*10)>y+(q*10))
            {
                System.out.println("Chefina");
                
            }
            if(x+(p*10)==y+(q*10))
            {
                System.out.println("Draw");
            }
        }
    }
}