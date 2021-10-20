import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class  DIRECTN{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            int n = Integer.parseInt(br.readLine());
            String in = br.readLine();
            boolean isSouth=false;
            for(int i =1;i<in.length();i++)
            {
                if(in.charAt(i)=='L'&&in.charAt(i-1)=='L')
                {
                    isSouth = true;break;
                }
                if(in.charAt(i)=='R'&&in.charAt(i-1)=='R')
                {
                    isSouth = true;break;
                }
            }
            System.out.println(isSouth==true?"YES":"NO");
        }
    }
}
