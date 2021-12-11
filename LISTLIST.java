import java.io.*;
import java.util.*;
class LISTLIST{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (n==1) {
                System.out.println("0");continue;
            }
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            HashMap<Integer,Integer> occurances = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(occurances.containsKey(arr[i])){
                    occurances.put(arr[i],occurances.get(arr[i])+1);
                }else{
                    occurances.put(arr[i],1);
                }
            }
            int maxrepeat = 0;
            //get the max repeating element in the array from occurances
            for(int i=0;i<n;i++){
                maxrepeat = Math.max(maxrepeat,occurances.get(arr[i]));
            }
            // System.out.println("Maxrepeat="+maxrepeat);
            if(maxrepeat==1){
                System.out.println("-1");continue;
            }
            // maxrepeat = (int) maxrepeat/2;
            // if (maxrepeat%2==0) {
            //     maxrepeat--;
                
            // }
            // else maxrepeat++;
            // if (maxrepeat>2) {
            //     if (maxrepeat%2==0) {
            //         System.out.println(n-maxrepeat+1);continue;
            //     }
            // }
            // maxrepeat = (int) maxrepeat/2;
            System.out.println((n-maxrepeat)+1);

        }
    }
}