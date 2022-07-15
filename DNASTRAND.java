import java.util.*;
class DNASTRAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if(str.charAt(i)=='T')
                System.out.print('A');
                else if(str.charAt(i)=='A')
                System.out.print('T');
                else if(str.charAt(i)=='C')
                System.out.print('G');
                else if(str.charAt(i)=='G')
                System.out.print('C');
            }
            System.out.println();
        }
        sc.close();
    }
}
