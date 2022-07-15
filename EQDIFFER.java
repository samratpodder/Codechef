import java.util.*;
class EQDIFFER{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (hm.containsKey(x)) {
                    hm.put(x, hm.get(x) + 1);
                } else {
                    hm.put(x, 1);
                }
            }
            int maxOccurence = 0;
            for (Integer i : hm.keySet()) {
                maxOccurence = Math.max(maxOccurence, hm.get(i));
            }
            int ans = n - Math.max(2,maxOccurence);
            if(n<=2){
                System.out.println(0);continue;
            } 
            else
            System.out.println(ans);
        }
        sc.close();
    }
}