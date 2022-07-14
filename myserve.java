import java.util.*;
class myserve {
    public static void main(String[] args) {
        HashSet<Integer> alice = new HashSet<>();
        HashSet<Integer> bob = new HashSet<>();
        for (int i = 1; i < 20; i+=4) {
            alice.add(i);
            alice.add(i+1);
        }
        for (int i = 3; i <= 20; i+=4) {
            bob.add(i);
            bob.add(i+1);
        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = p+q+1;
            if(alice.contains(r))
                System.out.println("ALICE");
            else if(bob.contains(r))
                System.out.println("BOB");
            else
                System.out.println("ALICE");
        }
    }
}