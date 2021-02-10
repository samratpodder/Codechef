import java.io.*;
class COVIDLQ
{
public static void main(String[] args)throws IOException
{
    InputStreamReader r=new InputStreamReader(System.in); 
    BufferedReader br=new BufferedReader(r);
    int t = Integer.parseInt(br.readLine());
    try {
        for(int i = 0;i<t;i++)
    {
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int flag = 0;
        String[] inp = str.split(" ");
        int countzero=0;
        for(int j = 0; j<n;j++)
        {
            String temp=inp[j];
            if(temp.equals("1")&&j>0)
            {
                
                if(countzero<5)
                {
                    flag=1;continue;
                }
                else
                {
                    flag=0;
                }
                countzero=0;
            }
            else
            {
                if(temp.equals("1"))
                {
                    continue;
                }
                countzero++;
            }
        }
        if(n-countzero==1)
        {
            System.out.println("YES");continue;
        }
        if(flag==1){
            System.out.println("NO");
         }
        else
        {
            System.out.println("YES");
        }
    } 
    br.close();
    r.close();   
    } catch (Exception e) { 
    }
}
}