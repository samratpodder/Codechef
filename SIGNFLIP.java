import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class SIGNFLIP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int ops = Integer.parseInt(str[1]);
            int[] arr = new int[n];
            String[] input =  br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < ops; i++) {
                if (arr[i]<0) {
                    arr[i] = arr[i]*-1;
                }
            }
            int res=0;
            for(int i =0; i<arr.length;i++){
                if (arr[i]>0) {
                    res+= arr[i];
                }
                
            }
            System.out.println(res);
        }
    }
}
