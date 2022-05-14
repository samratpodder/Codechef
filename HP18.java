import java.util.*;
class HP18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c1=0,c2=0;
            for(int i=0;i<n;i++)
		    {
		        long k=sc.nextLong();
		        if(k%a==0)
		        c1+=1;
		        else if(k%b==0)
		        c2+=1;
		    }
		    if(c2>=c1)
		    System.out.println("ALICE");
		    else
		    System.out.println("BOB");
            // int[] arr = new int[n];
            // List<Integer> arList = new ArrayList<>(n);
            // for (int i = 0; i < n; i++) {
            //     arList.add(sc.nextInt());
            // }
            // boolean canplay = true;
            // boolean bobT = true;
            // boolean AliceT = false;
            // while (arList.size()>0 && canplay) {
            //     if (bobT) {
            //         // for (Integer i : arList) {
            //         //     if(i%a==0)
            //         //     {
            //         //         arList.remove(i);
            //         //     }
            //         // }
            //         arList.removeIf(e->(e%a==0));
            //         bobT=false;
            //         AliceT=true;
            //     }
            //     else if (AliceT) {
            //         // for (Integer i : arList) {
            //         //     if(i%b==0)
            //         //     {
            //         //         arList.remove(i);
            //         //     }
            //         // }
            //         arList.removeIf(e->(e%b==0));
            //         bobT=true;
            //         AliceT=false;
            //     }
            //     if (arList.size()==0) {
            //         canplay=false;
            //     }
            //     for (Integer integer : arList) {
            //         if(integer%a== 0||integer%b == 0 ) 
            //         {
            //             canplay=true;break;
            //         }
            //     }
            // }
            // if(bobT) System.out.println("ALICE");
            // else if (AliceT) {
            //     System.out.println("BOB");
            // }
        }
        sc.close();
    }
}