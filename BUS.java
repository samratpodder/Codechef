import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class BUS {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().split("")[0]);
		while(t>0)
		{
			t--;
            boolean state=true;
            String in = br.readLine();
            // System.out.println(in);
            String[] inp = in.split(" ");
			int n = Integer.parseInt(inp[0]);int m = Integer.parseInt(inp[1]); int q = Integer.parseInt(inp[2]);
            // System.out.println(n+","+m+","+q);
            HashSet<Character> bus = new HashSet<Character>();
			for(int i = 0; i<q;i++)
			{
				String s = br.readLine();
                // System.out.println(s);
                char sign = s.charAt(0);
                // System.out.println(sign);
                char person = s.charAt(2);
                if(sign == '+')
                {
                    if(bus.contains(person))
                    {
                        state = false;
                    }
                    else{
                        bus.add(person);
                        if(bus.size()>m)
                        {
                            state = false;bus.remove(person);
                        }
                    }
                }
                else if(sign == '-')
                {
                    if(!bus.contains(person))
                    {
                        state=false;
                    }
                    else
                    bus.remove(person);
                }
			}
            if (!state) {
                System.out.println("Inconsistent");
            }
            else
            System.out.println("Consistent");
		}
    }
}