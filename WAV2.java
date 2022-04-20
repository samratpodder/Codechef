import java.util.*;
class WAV2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] roots = new int[n];
        int[] queries = new int[q];
        for (int i = 0; i < n; i++) {
            roots[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }
        Arrays.sort(roots);
        for (int i = 0; i < q; i++) {
            int pos = Arrays.binarySearch(roots, queries[i]);
            if(pos>=0) System.out.println(0);
            else{
                int ins = -pos-1;
                if((n-ins)%2 == 0) System.out.println("Positive");
                else System.out.println("Negative");
            }
        }
        sc.close();
    }
}