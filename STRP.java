import java.util.*;
class STRP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int ops = 0;
            for(int i = 0 ; i< n;i++)
            {
                if(i!=n-1&&str.charAt(i)==str.charAt(i+1))
                {
                    i++;ops++;
                }
                else ops++;
            }
            System.out.println(ops);
        }
        sc.close();
    }
}