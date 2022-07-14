import java.util.*;
class End_Sorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int idx1 = -1;
            int idxn = n;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==1)idx1=i;
                if (arr[i]==n) {
                    idxn=i;
                }
            }
            // System.out.println(idx1+"--"+idxn);
            if(idx1==0 && idxn==n-1) System.out.println(0);
            else if(idx1==0 && idxn!=n-1) System.out.println(n-1-idxn);
            else if(idx1!=0 && idxn==n-1) System.out.println(idx1);
            else{
                if(idxn<idx1) System.out.println(n-1-idxn+idx1-1);
                else System.out.println(n-1-idx1+idxn);
            }
        }
    }
}