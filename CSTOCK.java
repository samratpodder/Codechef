import java.util.*;
import java.io.*;
class CSTOCK {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            tc--;
            double val = sc.nextInt();
            double l = sc.nextInt();
            double r = sc.nextInt();
            double p = sc.nextInt();
                double b = val+(val*(p/100));

                if(b>=l && b<=r)
                System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
