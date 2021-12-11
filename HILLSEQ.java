import java.io.*;
import java.util.*;

class HILLSEQ {
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        OutputWriter out	= new OutputWriter(System.out);
        int tc = in.readInt();
        while(tc>0){
            tc--;
            int n = in.readInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.readInt();
            }
            Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
            int peak = Integer.MIN_VALUE;
            boolean flag = false;
            for (int i = 0; i < n; i++)
            {
                peak = Math.max(arr[i],peak);
                if (countMap.containsKey(arr[i]))
                {
                    int count = countMap.get(arr[i]);
                    count++;
                    if (count>2) {
                        out.printLine(-1);flag = true;break;
                    }
                    countMap.put(arr[i], count);

                } else
                {
                    countMap.put(arr[i], 1);
                }
            }
            if(flag) continue;
            if (countMap.get(peak)>1) {
                out.printLine(-1);continue;
            }
            SortedSet<Integer> keysmorethanone = new TreeSet<Integer>();
            for (int i : countMap.keySet()) {
                if (countMap.get(i)>1) {
                    keysmorethanone.add(i);
                }
            }
            Iterator<Integer> it = keysmorethanone.iterator();
            for (int i = keysmorethanone.size()-1; i >= 0; i--) {
                if(it.hasNext())
                {
                    int val = it.next();
                    countMap.put(val,countMap.get(val)-1);
                    arr[i] = val;
                }
            }
            arr[keysmorethanone.size()] = peak;
            countMap.put(peak,countMap.get(peak)-1);
            Set<Integer> mykeys0 = countMap.keySet();
            List<Integer> listset= new ArrayList<Integer>(mykeys0);
            Collections.sort(listset,Collections.reverseOrder());
            // SortedSet<Integer> mykeys = new TreeSet<Integer>(listset);
            // it = mykeys.iterator();
            int index = keysmorethanone.size()+1;
            for(Integer i : listset) {
                // int val = it.next();
                if(countMap.get(i)>0)
                {
                    arr[index] = i;
                    index++;
                    countMap.put(i,countMap.get(i)-1);
                }
            }
            for (int i=0;i<arr.length;i++) {
                out.print(arr[i]);
                if (i!=arr.length-1) {
                    out.print(" ");
                }
            }
            if (tc!=0) {
                out.print("\n");
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