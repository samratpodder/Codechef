import java.io.*;
class CARRYGOLD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0){
            tc--;
            String[] in = br.readLine().split(" ");
            int n  = Integer.parseInt(in[0]);n++;
            int x = Integer.parseInt(in[1]);
            int y = Integer.parseInt(in[2]);
            if(n*y>=x){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
