import java.util.Scanner;
class chefcoin
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int counter = 0;
        for(int i =0;i<t;i++)
        {
            String in = sc.next();
            sc.nextLine();
            String[] in1 = in.split(" ");
            int n = Integer.parseInt(in1[0]);
            int k = Integer.parseInt(in1[1]);
            String array = sc.next();
            sc.nextLine();
            String[] ar = array.split(" ");
            while(k>0)
            {
                for(int j = n-1 ; j >= 0;j++)
                {
                    if(ar[i]== "H")
                    {
                        for(String z : ar)
                        {
                            if(z.equals("H"))
                                z = "T";
                            else
                                z = "H";
                        }
                    }
                    ar[i] = "";
                }
                k--;
            }
            for(String z : ar)
            {
                if(z.equals("H"))
                counter++;
            }
            System.out.println(counter);
        }
        sc.close();
    }
}
