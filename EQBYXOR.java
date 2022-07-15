import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EQBYXOR
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		while(T-->0){
		    int a= s.nextInt();
		    int b=s.nextInt();
		    int n=s.nextInt();
		    
		    int z=1;
		    while(z<n){
		      z=z*2;  
		    }
		    
		    if((a^b) == 0){
		        System.out.println("0");
		    }
		    else if((a^b) < n){
		           System.out.println("1");
		    }
		    else if((a^b) < z){
		           System.out.println("2");
		    }
		    
		    else{
		           System.out.println("-1");
		    }
		    
		}
	}
}

// import java.util.*;
// class EQBYXOR {
//     public static long getPositionofLeftmostUnsetBit(long num)
//     {
//         if ((num & (num + 1)) == 0)
//         {
//             int pos = 0;
//             while(num!=0)
//             {
//                 num = num >> 1;
//                 pos++;
//             }
//             return pos+1;
//         }
            
//         long pos = 0;
//         for (long temp = num, count = 0; temp > 0; temp >>= 1, count++)
//             if ((temp & 1) == 0)
//                 pos = count;
//         return pos+1;
//     }
//     public static int countUnsetBits(int num){
//         int count = 0;
//         for(int i=0;i<32;i++){
//             if((num&(1<<i))==0)
//                 count++;
//         }
//         return count;
//     }
//     public static long getXorValue(long a, long b){
//         long xorval = 0;
//         String xorv = "";
//         while(a>0||b>0)
//         {
//             // System.out.println(xorval);
//             if(((a&1)==1 && (b&1)==1)||((a&1)==0 && (b&1)==0)){
//                 // xorval = xorval<<1;
//                 xorv ="0"+xorv;
//             }
//             else{
//                 // xorval = xorval|1;
//                 // xorval = xorval<<1;
//                 xorv = "1"+xorv;
                
//             }
//             a=a>>1;
//             b=b>>1;
//         }
//         xorval = Integer.parseInt(xorv,2);
//         return xorval;
//     }
//     static int count_bits(int n)
//     {
//         return Integer.toBinaryString(n).length();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         while(tc-->0)
//         {
//             long a = sc.nextInt();
//             long b = sc.nextInt();
//             long n = sc.nextInt();
//             if(a==b) {
//                 System.out.println(0);continue;
//             }
//             long pos = getXorValue(a,b);
//             // System.out.println(pos);
//             if(pos<=n)
//                 System.out.println(1);
//             else
//                 System.out.println(-1);
//         }
//     }
// }
/* package codechef; // don't place package name! */
