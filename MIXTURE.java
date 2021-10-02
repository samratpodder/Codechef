import java.util.*;
public class MIXTURE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int a = sc.nextInt();int b = sc.nextInt();
            if (a>0&&b>0) {
                System.out.println("Solution");continue;
            }
            if (b==0) {
                System.out.println("Solid");
            }
            if (a==0) {
                System.out.println("Liquid");
            }
        }
    }
}
