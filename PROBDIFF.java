import java.util.*;
class PROBDIFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int a3=sc.nextInt();
            int a4=sc.nextInt();
            int arr[] = {a1,a2,a3,a4};
            Set<Integer> mySet = new HashSet<Integer>();
            mySet.add(a1);
            mySet.add(a2);
            mySet.add(a3);
            mySet.add(a4);
            if(mySet.size()==1)
                System.out.println(0);
            else if(mySet.size()==4 || mySet.size()==3)
                 System.out.println(2);
            else{
                int temp=a1;
                int count=0;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==temp)
                        count++;
                }
                if(count==2)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
        }
    }
}
