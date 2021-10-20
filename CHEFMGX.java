import java.io.*;
import java.util.*;
class CHEFMGX {
    
        static int[] prime = new int[10000001];
        static{for(int i = 0; i<prime.length;i++){prime[i]=1;}}
    
        
    static int[] primesuptoi = new int[10000001];
    
    static void sieve(){
        prime[0]=0;
        prime[1]=0;
        for (int i = 2; i*i < 10000001; i++) {
            if (prime[i]==1) {
                for (int j = (i*i); j < 10000001; j+=i) {
                    prime[j]=0;
                }
            }
        }
        for(int i =2;i<10000001;i++)
            primesuptoi[i] = primesuptoi[i-1]+prime[i];
    }
    public static void main(String[] args){
        InputReader in 		= new InputReader(System.in); 
        OutputWriter out	=	new OutputWriter(System.out); 
        int tc = in.readInt();
        sieve();
        while(tc>0)
        {
            tc--;
            // String[] input = in.readString().split(" ");
            int x = in.readInt();
            int y = in.readInt();
            int steps = y-x-(primesuptoi[y]-primesuptoi[x]);
            // System.out.println(prime[x]+","+prime[y]+" /"+primesuptoi[x]+","+primesuptoi[y]);
            if (prime[x+1]==1) {
                // System.out.println(steps+1);
                out.printLine(steps+1);
                 continue;
            }
                if(x==1&&y==2) out.printLine(2);
                if(x==2&&y==3) out.printLine(2);
                if(x==1&&y==3) out.printLine(2);
            
            else{
                // System.out.println(steps);
                out.printLine(steps);
            }

        }
        out.flush();  out.close(); 
    }
}
class InputReader { 
 
    private InputStream stream; 
    private byte[] buf = new byte[1024]; 
    private int curChar; 
    private int numChars; 
    private SpaceCharFilter filter; 

    public InputReader(InputStream stream) { 
        this.stream = stream; 
    } 

    public int read() { 
        if (numChars == -1) 
            throw new InputMismatchException(); 
        if (curChar >= numChars) { 
            curChar = 0; 
            try { 
                numChars = stream.read(buf); 
            } catch (IOException e) { 
                throw new InputMismatchException(); 
            } 
            if (numChars <= 0) 
                return -1; 
        } 
        return buf[curChar++]; 
    } 

    public int readInt() { 
        int c = read(); 
        while (isSpaceChar(c)) 
            c = read(); 
        int sgn = 1; 
        if (c == '-') { 
            sgn = -1; 
            c = read(); 
        } 
        int res = 0; 
        do { 
            if (c < '0' || c > '9') 
                throw new InputMismatchException(); 
            res *= 10; 
            res += c - '0'; 
            c = read(); 
        } while (!isSpaceChar(c)); 
        return res * sgn; 
    } 

    public String readString() { 
        int c = read(); 
        while (isSpaceChar(c)) 
            c = read(); 
        StringBuilder res = new StringBuilder(); 
        do { 
            res.appendCodePoint(c); 
            c = read(); 
        } while (!isSpaceChar(c)); 
        return res.toString(); 
    } 

    public boolean isSpaceChar(int c) { 
        if (filter != null) 
            return filter.isSpaceChar(c); 
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1; 
    } 

    public String next() { 
        return readString(); 
    } 

    public interface SpaceCharFilter { 
        public boolean isSpaceChar(int ch); 
    } 
} 

class OutputWriter { 
    private final PrintWriter writer; 

    public OutputWriter(OutputStream outputStream) { 
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream))); 
    } 

    public OutputWriter(Writer writer) { 
        this.writer = new PrintWriter(writer); 
    } 

    public void print(Object...objects) { 
        for (int i = 0; i < objects.length; i++) { 
            if (i != 0) 
                writer.print(' '); 
            writer.print(objects[i]); 
        } 
    } 

    public void printLine(Object...objects) { 
        print(objects); 
        writer.println(); 
    } 

    public void close() { 
        writer.close(); 
    } 

    public void flush() { 
        writer.flush(); 
    } 

    } 

class IOUtils { 

    public static int[] readIntArray(InputReader in, int size) { 
        int[] array = new int[size]; 
        for (int i = 0; i < size; i++) 
            array[i] = in.readInt(); 
        return array; 
    } 

    } 
