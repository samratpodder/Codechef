import java.util.Scanner;
class BESTOFTWO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            System.out.println(Math.max(sc.nextInt(),sc.nextInt()));
        }
    }
}
