import java.util.*;
import java.io.*;
class CAN_REACH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0)
        {
            t--;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            if(Math.abs(x)%k==0&&Math.abs(y)%k==0) System.out.println("YES"); else System.out.println("NO");
        }
    }
}
