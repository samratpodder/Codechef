import java.util.HashSet;
import java.util.Scanner;
public class SUNDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(6);
        set.add(7);
        set.add(13);
        set.add(14);
        set.add(20);
        set.add(21);
        set.add(27);
        set.add(28);
        while(tc-->0)
        {
            int days = sc.nextInt();
            int var;
            int dd=0;
            for (int i = 0; i < days; i++) {
                var = sc.nextInt();
                if(!set.contains(var)){
                    dd++;
                }
            }
            System.out.println(8+dd);
        }
    }
}