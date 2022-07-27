/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
        while (tc-->0) {
            int size = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            char[] in = sc.nextLine().toCharArray();
            int ans = 0;
            for (int i =0;i<size ;i++)
            {
                if(in[i]=='0')ans++;
                else ans--;
            }
            ans = Math.abs(ans);
            ans = (ans/k) + ((ans%k!=0)?1:0);
            System.out.println(ans);
        }
	}
}
