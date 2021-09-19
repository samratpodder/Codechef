import java.io.*;
class SHUFFLIN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int tc = Integer.parseInt(br.readLine());
	    while(tc>0)
	    {
	        tc--;
	        int n = Integer.parseInt(br.readLine());
	        String[] input = br.readLine().split(" ");
	        int[] a = new int[n];
	        for(int i = 0 ; i<n;i++)
	        {
	            a[i] = Integer.parseInt(input[i]);
	        }
	        int e = n/2;
	        int o = n/2+n%2;
	        int ao=0;
	        int ae=0;
	        for(int i = 0; i<n; i++)
	        {
	            if(a[i]%2==0)
	            {
	                ae++;
	            }
	            else{
	                ao++;
	            }
	        }
	       System.out.println(Math.min(ae,o)+Math.min(ao,e));
	    }
	}
}
