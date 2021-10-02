import java.util.Scanner;
class THREEBOX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            tc--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            double d = sc.nextInt();
            System.out.println((int)Math.ceil((a+b+c)/d));
        }
    }
}
