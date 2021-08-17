import java.util.*;
class XLSQUARE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			t--;
			int n = sc.nextInt();int a = sc.nextInt();
			if(n<4)
			System.out.println(a);
			else
			{
				int m = (int) Math.floor(Math.sqrt(n));
				System.out.println(m*a);
			}
		}
	}
}
