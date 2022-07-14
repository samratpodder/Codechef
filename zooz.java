import java.util.*;
class zooz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            // if(n%4==0)
            // {
            //     for (int i = 0; i < n/4; i++) {
            //         System.out.print("1001");
            //     }
            //     System.out.println();
            //     continue;
            // }
            // if (n%3==0) {
            //     for (int i = 0; i < n/3; i++) {
            //         System.out.print("010");
            //     }
            //     System.out.println();
            //     continue;
            // }
            // if(n%2==0)
            // {
            //     for (int i = 0; i < (n-2)/4; i++) {
            //         System.out.print("1001");
            //     }
            //     System.out.print("01\n");
            //     continue;
            // }
            // for (int i = 0; i < n; i+=2) {
            //     System.out.print("01");
            // }
            // if(n%2==1)
            // {
            //     System.out.print("0\n");
            // }
            // else
            // {
            //     System.out.print("\n");
            // }
            if(n==3) System.out.println("010");
            else if(n==4) System.out.println("1001");
            else if(n==5) System.out.println("01010");
            else if(n==6) System.out.println("010010");
            else{
                n=n-3;
                String s="010";
                while(n!=3)
                {
                    s+="0";
                    n--;
                }
                s+="010";
                System.out.println(s);
            }
        }
    }
}
