import java.util.Scanner;
public class REPEAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = sc.nextInt();
            n--;
            int nsq = n*n;
            System.out.println((s-(nsq))/k);
        }
        sc.close();
    }
}
