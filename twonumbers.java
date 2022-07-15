import java.util.*;
public class twonumbers {
    public static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int lcm(int a, int b)
    {
        return (a*b)/gcd(a,b);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int res=-1;
            for(int a=1;a<n;a++)
            {
                res=Math.max(res,lcm(a,n-a)-gcd(a, n-a));
            }
            System.out.println(res);
        }
    }
}
