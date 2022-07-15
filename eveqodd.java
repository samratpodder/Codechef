import java.util.*;
class eveqodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt(),odd = 0;
            int[] arr = new int[2*n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]%2!=0) odd++;
            }
            int even = 2*n - odd;
            System.out.println(n-Math.min(odd,even));
        }
    }
}
