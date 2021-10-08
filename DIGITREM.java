import java.io.*;


public class DIGITREM {
    static boolean diginNum(String str, char ch){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0){
            tc--;
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int d = Integer.parseInt(in[1]);
            // if (!diginNum(number, d)) {
            //     System.out.println(0);continue;
            // }
            // if (number.length()==1&&number.charAt(0)!=d) {
            //     System.out.println(0);continue;
            // }
            // else if (number.length()==1&&number.charAt(0)==d) {
            //     System.out.println(1);continue;
            // }
            // int div = 1;
            // for (int i = 1; i < number.length(); i++) {
            //     div=div*10;
            // }
            // int minval = 0;
            // for (int i = 0; i < number.length(); i++) {
            //     if (number.charAt(i)==d) {
            //         minval+=div;
            //     }
            //     div=div/10;
            // }
            
            // int ans = 0;
            // while (diginNum(number, d)&&ans<=minval) {
            //     int num = Integer.parseInt(number);
            //     ans++;
            //     number = Integer.toString(num+1);
            // }
            // System.out.println(Math.min(minval,ans));
            int newn = n, rem = 0, minval = 0, place = 0;
            while (newn>0) {
                rem = newn%10;
                newn= newn/10;
                place++;
                if(rem == d){
                    newn =  newn* (int)Math.pow(10,place)+(rem+1)*(int)Math.pow(10, place-1);
                    place=0;
                    minval=newn-n;
                }
            }
            System.out.println(minval);
        }
    }
}
