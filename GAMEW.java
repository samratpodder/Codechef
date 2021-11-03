import java.io.*;
import java.util.*;
public class GAMEW {
    public static void main(String[] args) {
        InputReader in 		= new InputReader(System.in); 
        OutputWriter out	= new OutputWriter(System.out);
        int tc = in.readInt();
        while(tc>0)
        {
            tc--;
            int n = in.readInt();
            String str = in.readString();
            int[] arr = new int[str.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            // int countz = arr[0]==0?1:0, counto = arr[0]==1?0:1;
            int count =1;
            for (int i = 1; i < arr.length; i++) {

                if (arr[i]!=arr[i-1]) {
                    count+=1;
                }
                
            }
            System.out.println(count%3==2?"RAMADHIR":"SAHID");
            // if (arr[0]==arr[arr.length-1]) {
            //     out.printLine("SAHID");
            // }
            // else
            //     out.printLine("RAMADHIR");
            // out.printLine(counto);
            // out.printLine(countz);
        }
        out.flush();  
        out.close();
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