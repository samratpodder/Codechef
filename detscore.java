import java.util.Scanner;

public class detscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            System.out.println((x/10)*n);
        }
    }
}
