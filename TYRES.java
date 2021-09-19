import java.util.Scanner;
class TYRES{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0)
        {
            tc--;
            int n = sc.nextInt();
            int cars = n%4;
            if(cars%2==0 && cars>0)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}