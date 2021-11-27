import java.util.*;
import java.io.*;

class EQUALCOIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0)
        {
            tc--;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x%2==0&&y%2==0&&(x*1+y*2)%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
