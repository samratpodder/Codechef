import java.util.*;
class Chef_On_Date{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            if(sc.nextInt()<sc.nextInt()) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}