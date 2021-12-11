// import java.io.*;
import java.util.*;
class S06E06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();sc.nextLine();
        while(tc-->0){
            
            String[] in = sc.nextLine().split(" ");
            String n = (in[0]);
            int k = Integer.parseInt(in[1]);
            int[] arr = new int[n.length()];
            for(int i=0;i<n.length();i++){
                arr[i] = Integer.parseInt(n.charAt(i)+"");
            }
            while(arr[0]!=9&&k>=1){
                int min = 1000000000;
                int idx = -1;
                for (int i = 0; i < arr.length; i++) {
                    // find the minimum number of digits in array n
                    int num  = arr[i];
                    if(num<min){
                        min = num;
                        idx=i;
                    }
                }
                if(arr[idx]!=9){
                    arr[idx] = arr[idx] + 1;
                    k-=1;
                }
                else continue;
            }
            // long st=1;
            // Arrays.sort(arr);
            // while(arr[0]!=9&&k>=1){
            //     for (int i = 0; i < arr.length; i++) {
            //         if(arr[i]==9||k<1) break;
            //         while (arr[i] < (st + '0') && k >= 1) {
            //             arr[i] = arr[i] + 1;
            //             k -= 1;
            //         }
            //     }
            //     st++;
            // }
            int ans=1;
            for (int i = 0; i < arr.length; i++) {
                ans*=arr[i];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
