/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class High_Frequency
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int size = sc.nextInt();
            int[] arr = new int[size];
            int top = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
                top = Math.max(top, map.get(arr[i]));
            }
            int topcount = 0;int topEle = -1;
            for(Integer i : map.keySet()){
                if(top==map.get(i)){
                    topcount++;
                    topEle = i;
                }
            }
            if(topcount>1){
                System.out.println(top);continue;
            }
            HashSet<Integer> set = new HashSet<>(map.values());
            int fmax = map.get(topEle);
            set.remove(fmax);
            int stop = 0;
            for (Integer integer : set) {
                stop = Math.max(integer, stop);
            }
            System.out.println(Math.max(stop, (fmax/2)+(fmax%2)));
        }
	}
}