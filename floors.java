import java.util.*;
class floors{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int chef = sc.nextInt();
            int chefina = sc.nextInt();
            double cheffloor = Math.ceil(chef/10.0);
            double chefinafloor =Math.ceil(chefina/10.0);
            System.out.println((int)Math.abs(cheffloor-chefinafloor));
        }
    }
}