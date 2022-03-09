import java.util.*;
class BOMBTHEBASE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0)
		{
		    int n= sc.nextInt();
		    long[] arr = new long[n];
		    long x = sc.nextInt();
		    for(int i = 0 ;i<n;i++)
		        arr[i] = sc.nextLong();
		    int idx = 0;boolean c = false;
		    for(int i = n-1 ; i>=0 ; i--)
		    {
		        if(arr[i]<x){
		            idx=i+1;c=true;break;
		        }
		    }
		    if(!c) System.out.println(0);
		    else
		    System.out.println(idx);
		}
        sc.close();
	}
}
