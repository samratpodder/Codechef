/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class UTKPLC
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		while(tc-->0)
		{
		    String[] in = sc.nextLine().split(" ");
		    // System.out.println(in);
		    char f = in[0].charAt(0);
		    char s = in[1].charAt(0);
		    char t = in[2].charAt(0);
		    String offer = sc.nextLine();
		    char fo = offer.charAt(0);
		    char so = offer.charAt(2);
			Set <Character> set = new HashSet<Character>();
			set.add(fo);
			set.add(so);
			if(set.contains(f)) System.out.println(f);
			else if(set.contains(s)) System.out.println(s);
			else System.out.println(t);
			// if(f==fo||
			// s==fo||
			// t==fo)
			// {
			// 	if(f==fo) System.out.println(f);
			// 	if(s==fo) System.out.println(s);
			// 	if(t==fo) System.out.println(t);
			// }
		    
		    // else{
		    //     if(f==so) System.out.println(f);
    		//     if(s==so) System.out.println(s);
    		//     if(t==so) System.out.println(t);
		    // }
		}
	}
}
