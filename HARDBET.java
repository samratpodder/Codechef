import java.util.*;
class HARDBET{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a<b&&a<c) {
               System.out.println("Draw"); 
            }
            if (b<a&&b<c) {
                System.out.println("Bob");
            }
            if (c<b&&c<a) {
                System.out.println("Alice");
            }
        }
        sc.close();
    }
}