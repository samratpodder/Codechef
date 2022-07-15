import java.util.*;
class Construct_N{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int n = sc.nextInt();
            
            if(helper(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean helper(int n)
    {
        if(n<0) return false;
        if(n==0) return true;
        
        if(n%2==0) return true;
        else if(n%7==0) return true;
        
        if(helper(n-2)) return true;
        else if(helper(n-7)) return true;
        return false;
    }
}