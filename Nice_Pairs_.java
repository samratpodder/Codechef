import java.io.*;
class Nice_Pairs_{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc>0) {
            tc--;
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            long pairs=0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j <= Math.min(n-1, i+9); j++) {
                    if (j-i==Math.abs(arr[j]-arr[i])) {
                        pairs++;
                    }
                }
            }
            System.out.println(pairs);
        }
    }
}