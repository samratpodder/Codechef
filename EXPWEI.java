import java.util.*;
import java.io.*;
class EXPWEI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tc = sc.nextLong();
        while(tc>0)
        {
            tc--;
            long n = sc.nextLong();
            long mod = 998244353, p=1,q=1;
            if (n%2==0) {
                if(n%4==0)
                {
                    q=1;
                    p=n/4;
                    p%=mod;
                    p*=(n+1);
                    p%=mod;
                    p*=(n+1);
                    p%=mod;
                }
                if(n%2==0)
                {
                    q=2;
                    p=n/2;
                    p%=mod;
                    p*=(n+1);
                    p%=mod;
                    p*=(n+1);
                    p%=mod;
                }
            }
            else{
                p*=(n+1)/2;
                    p%=mod;
                    p*=(n+1)/2;
                    p%=mod;
                    p*=n;
                    p%=mod;
            }
            long inv = 0 ;
            if(q==1)
             inv = 1;
             if(q==2){
             System.out.println(499122181);continue;} 
             long ans = p*inv;
             ans%=mod;
             System.out.println(ans);
               }
    }
}
