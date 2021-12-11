import java.io.*;
import java.util.*;
class S01E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0) {
            int n = sc.nextInt();
            if(n>21){System.out.println("YES");}else System.out.println("NO");
        }
    }
}
