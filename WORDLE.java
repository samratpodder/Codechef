import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.*;
class WORDLE {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-->0) {
            String x = br.readLine();
            String y = br.readLine();
            String m = new String();
            for(int i = 0; i< x.length();i++)
            {
                if(x.charAt(i)==y.charAt(i)) m+='G';
                else m+='B';
            }
            System.out.println(m);
        }

    }
}
