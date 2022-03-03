import java.util.*;
class PERMXORITY{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            if(n==2)
            {
                System.out.println("-1");continue;
            } 
            if(n%2!=0){
                for (int i = 1; i <= n; i++) {
                System.out.print(i+" ");
                }
                System.out.println();continue;
            }
            else{
                int i =1;
                for (; i < 4; i++) {
                    if (i==1) {
                        System.out.print("2 ");
                    }
                    if (i==2) {
                        System.out.print("3 ");
                    }
                    if (i==3) {
                        System.out.print("1 ");
                    }
                }
                for (; i <= n; i++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}