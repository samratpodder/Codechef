import java.util.*;
class PMA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<0)
                    arr[i] = arr[i]*-1;
            }
            // if (n==2) {
            //     if (arr[0]==arr[1]) {
            //         System.out.println(0);
            //     }
            //     else{
            //         System.out.println(Math.abs(arr[0]-arr[1]));
            //     }
            //     continue;
            // }
            // int oddmax = arr[1];
            // int evenmin = arr[0];
            // int oddmax_idx=1;
            // int evenmin_idx=0;

            // for (int i = 2; i < arr.length; i++) {
            //     if (i%2==0) {
            //         if(evenmin>arr[i])
            //         {
            //             evenmin = arr[i];
            //             evenmin_idx = i;
            //         }
            //     }
            //     else
            //     {
            //         if (oddmax<arr[i]) {
            //             oddmax = Math.max(oddmax,arr[i]);
            //             oddmax_idx = i;
            //         }
            //     }
            // }
            // int temp = arr[oddmax_idx];         
            // arr[oddmax_idx] = arr[evenmin_idx];
            // arr[evenmin_idx] = temp;               
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if(i%2!=0)
                a.add(arr[i]);
                else b.add(arr[i]);
            }
            Collections.sort(a);
            Collections.sort(b);
            // for (Integer integer : b) {
            //     System.out.println(integer);
            // }
            // System.out.println();
            // for (Integer integer : a) {
            //     System.out.println(integer);
            // }
            if(a.get(a.size()-1) > b.get(0)){
                int temp = a.get(a.size()-1);        
                a.set(a.size()-1,b.get(0));
                b.set(0,temp);           
            }
            // System.out.println("------");
            // for (Integer integer : b) {
            //     System.out.println(integer);
            // }
            // System.out.println();
            // for (Integer integer : a) {
            //     System.out.println(integer);
            // }
            // System.out.println("--------");
            long sum = 0;
            // for (int i = 0; i < n; i++) {
            //    if(i%2==0)
            //    {
            //        sum+=arr[i];
            //    }
            //    else sum-=arr[i];
            // }
            for (Integer i : a) {
                sum-=i;
            }
            for (Integer i : b) {
                sum+=i;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
