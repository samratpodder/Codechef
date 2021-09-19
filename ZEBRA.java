//Some of the methods are copied from GeeksforGeeks Website  
import java.util.*;
import java.io.*;
public class ZEBRA
{ 
  //static Scanner sc=new Scanner(System.in)
 // static  Reader sc=new Reader();
  static FastReader sc=new FastReader(System.in);
  
  static long mod = (long)(1e9)+ 7;
  static int max_num=(int)1e5+5;
 
 public static void main (String[] args) throws java.lang.Exception
   {
	try{
	    /*
	        int n=sc.nextInt();
	        Collections.sort(al,Collections.reverseOrder());
	     
	        long n=sc.nextLong();
	        String s=sc.next();
	        StringBuilder sb=new StringBuilder();
	     */
		  int t = sc.nextInt();
		  while(t-->0)
		    { 
		       int n=sc.nextInt();
		       int k=sc.nextInt();
		       
		       String s=sc.next();
		       char a[]=s.toCharArray();
		       
		       char pre=a[0];
		       char f=pre;
		       int zig=0;
		       for(int i=1;i<n;i++)
		        {
		            if(a[i]!=pre)
		             {
		                 pre=a[i];
		                 zig++;
		             }
		        }
		      if(zig<k)
		       {
		           out.println(-1);
		           continue;
		       }
		      if(f=='0')
		       {
		           fun1(a,n,k);
		       }
		      else
		       {
		         fun2(a,n,k);
		       }
		       
		    }
	     out.flush();
	     out.close();
	   }     
	catch(Exception e)
		 {}
	}
 
 /*
   ...SOLUTION ENDS HERE...........SOLUTION ENDS HERE...
 */
 
static void flag(boolean flag)
   {
       out.println(flag ? "YES" : "NO");
       out.flush();
   }
   
 /*                     
    Map<Long,Long> map=new HashMap<>();
             for(int i=0;i<n;i++)
               {
                  if(!map.containsKey(a[i]))
                   map.put(a[i],1);
                 else
                   map.replace(a[i],map.get(a[i])+1);
               }
     
    Set<Map.Entry<Long,Long>> hmap=map.entrySet();
             for(Map.Entry<Long,Long> data : hmap)
               {
          
               }
       
   */
   
//  static class Pair
//    {
//       int x,y;
//       Pair(int x,int y)
//        {
//           this.x=x;
//           this.y=y;
//        }
//    }

//  Arrays.sort(p, new Comparator<Pair>()
//     {
//        @Override
//        public int compare(Pair o1,Pair o2)
//        {
//           if(o1.x>o2.x) return 1;
//           else if(o1.x==o2.x)
//             {
//                if(o1.y>o2.y) return 1;
//                else return -1;
//              }
//           else return -1;
//       }});

 static void fun1(char a[],int n,int k)
   {
       int ans=-1;
		           if(k%2==0)
		            {
		                for(int i=n-1;i>=0;i--)
		                 {
		                     if(a[i]=='0')
		                      {
		                          ans=i+1;
		                          break;
		                      }
		                 }
		            }
		           else
		            {
		               for(int i=n-1;i>=0;i--)
		                 {
		                     if(a[i]=='1')
		                      {
		                          ans=i+1;
		                          break;
		                      }
		                 }  
		            }
		           out.println(ans);
   }
   static void fun2(char a[],int n,int k)
    {
        int ans=-1;
		           if(k%2==0)
		            {
		                for(int i=n-1;i>=0;i--)
		                 {
		                     if(a[i]=='1')
		                      {
		                          ans=i+1;
		                          break;
		                      }
		                 }
		            }
		           else
		            {
		               for(int i=n-1;i>=0;i--)
		                 {
		                     if(a[i]=='0')
		                      {
		                          ans=i+1;
		                          break;
		                      }
		                 }  
		            }
		           out.println(ans);    
    }
    
static void print(int a[])
  {
     int n=a.length;
     for(int i=0;i<n;i++)
       {
          out.print(a[i]+" ");
       }
     out.println();
     out.flush();
  }
static void print(long a[])
  {
     int n=a.length;
     for(int i=0;i<n;i++)
       {
          out.print(a[i]+" ");
       }
     out.println();
     out.flush();
  } 
static void print_int(ArrayList<Integer> al)
  {
     int si=al.size();
     for(int i=0;i<si;i++)
       {
          out.print(al.get(i)+" ");
       }
     out.println();
     out.flush();
  }
static void print_long(ArrayList<Long> al)
  {
     int si=al.size();
     for(int i=0;i<si;i++)
       {
          out.print(al.get(i)+" ");
       }
     out.println();
     out.flush();
  }
  
static int LowerBound(int a[], int x) 
 { // x is the target value or key
  int l=-1,r=a.length;
  while(l+1<r) {
    int m=(l+r)>>>1;
    if(a[m]>=x) r=m;
    else l=m;
  }
  return r;
}

 static int UpperBound(int a[], int x)
  {// x is the key or target value
    int l=-1,r=a.length;
    while(l+1<r) {
       int m=(l+r)>>>1;
       if(a[m]<=x) l=m;
       else r=m;
    }
    return l+1;
 }
static void DFS(ArrayList<Integer> graph[],boolean[] visited, int u)
	{
        visited[u]=true;
        int v=0;
        for(int i=0;i<graph[u].size();i++)
        {
            v=graph[u].get(i);
            if(!visited[v])
               DFS(graph,visited,v);
        }
  } 
static boolean[] prime(int num)
 {
	      boolean[] bool = new boolean[num];
		     
		      for (int i = 0; i< bool.length; i++) {
		         bool[i] = true;
		      }
		      for (int i = 2; i< Math.sqrt(num); i++) {
		         if(bool[i] == true) {
		            for(int j = (i*i); j<num; j = j+i) {
		               bool[j] = false;
		            }
		         }
		      }
		      if(num >= 0) {
		    	  bool[0] = false;
		    	  bool[1] = false;
		      }
		      
		      return bool;
  }
static long nCr(long a,long b,long mod)
{
 return (((fact[(int)a] * modInverse(fact[(int)b],mod))%mod * modInverse(fact[(int)(a - b)],mod))%mod + mod)%mod;
}
static long fact[]=new long[max_num];
static void fact_fill()
 {
   long fact[]=new long[max_num];
   fact[0]=1l;
	for(int i=1;i<max_num;i++)
	  {
	    fact[i]=(fact[i-1]*(long)i);
	    if(fact[i]>=mod)
	      fact[i]%=mod;
	  } 
 }
static long modInverse(long a, long m)
	    {
	       return power(a, m - 2, m);
	    }
static long power(long x, long y, long m)
	    {
	        if (y == 0)
	            return 1;
	        long p = power(x, y / 2, m) % m;
	        p = (long)((p * (long)p) % m);
	        if (y % 2 == 0)
	            return p;
	        else
	            return (long)((x * (long)p) % m);
	    }
static long sum_array(int a[])
 {
    int n=a.length;
    long sum=0;
    for(int i=0;i<n;i++)
     sum+=a[i];
    return sum;
 }
static long sum_array(long a[])
 {
    int n=a.length;
    long sum=0;
    for(int i=0;i<n;i++)
     sum+=a[i];
    return sum;
 }

static void sort(int[] a) 
   {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
static void sort(long[] a) 
   {
		ArrayList<Long> l=new ArrayList<>();
		for (long i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}

static void reverse_array(int a[])
 {
    int n=a.length;
    int i,t; 
    for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
 }
static void reverse_array(long a[])
 {
    int n=a.length;
    int i; long t; 
    for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
 }

static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
          
        return gcd(b%a, a); 
    } 
static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
          
        return gcd(b%a, a); 
    } 

   static class FastReader{
 
        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;
 
        FastReader(InputStream is) {
            in = is;
        }
 
        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }
 
        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan());
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }
 
        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
 
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan());
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
   
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    }
  static  PrintWriter out=new PrintWriter(System.out);
  static int int_max=Integer.MAX_VALUE;
  static int int_min=Integer.MIN_VALUE;
  static long long_max=Long.MAX_VALUE;
  static long long_min=Long.MIN_VALUE;
}
// Thank You !