import java.util.Scanner;

class CHEFAPPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(s-x-y >= z) System.out.println(0);
            else if(s >= y+ z || s >=x+z) System.out.println(1);
            else System.out.println(2);
        }
    }
}
