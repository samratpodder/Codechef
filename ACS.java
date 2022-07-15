import java.util.*;
class ACS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int ans = n/100;
            int rem = n%100;
            if(ans+rem<=10) System.out.println(ans+rem);
            else System.out.println(-1);
        }
        sc.close();
    }
}