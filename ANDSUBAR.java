import java.io.*;
class ANDSUBAR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0){
            tc--;
            double n = Double.parseDouble(br.readLine());
            if (n==1) {
                System.out.println(1);continue;
            }

            // double nearestPoftwo = Math.log(n) / Math.log(2);
            // int np2 = (int) nearestPoftwo;
            // double c=0;
            // if (np2!=nearestPoftwo) {
            //         c=n-Math.pow(2,np2)+1;   
            // }
            // else{
            //         c=Math.pow(2,np2)-Math.pow(2,np2-1); 
            // }
            // System.out.println((int)Math.max(c,(int)n/2));
            double storelast = 1;
            for (double i = 1; i <= n; i=i*2) {
                storelast = i;
            }
            System.out.println((int)Math.max(storelast/2, (n-storelast)+1));
        }
    }
}
