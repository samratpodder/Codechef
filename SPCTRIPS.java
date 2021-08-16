// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// class SPCTRIPS {
//     public static int memory[] = new int[100000];
//     static{
//         for (int i = 0; i < memory.length; i++) {
//             memory[i]=0;
//         }
//     }
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int tc = Integer.parseInt(br.readLine());
//         for (int t = 0; t < tc; t++) {
//             int n=Integer.parseInt(br.readLine());
//             if (memory[n]>0) {
//                 System.out.println(memory[n]);continue;
//             }
//             int knownIndex = 0;
//             int numAccepted=0;
//             for (int i = n-1; i > 1; i--) {
//                 if (memory[i]>0) {
//                     knownIndex = i;
//                     numAccepted = memory[knownIndex];
//                     // System.out.println(knownIndex+","+numAccepted);
//                     break;
//                 }
//             }
//             if (knownIndex>0) {
//                     for (int i = 1; i <= n; i++) {
//                     for (int j = knownIndex+1; j <= n; j++) {
//                         if(i%j !=0){
//                             if (j%(i%j)==0) {
//                                 // System.out.println(i+","+j+","+i%j);
//                             numAccepted++;
//                             }
//                         }
                        
//                     }
//                     knownIndex=0;
//                 }
//             }
//             else{
//                 for (int i = 1; i <= n; i++) {
//                 for (int j = 1; j <= n; j++) {
//                     if(i%j !=0){
//                         if (j%(i%j)==0) {
//                             // System.out.println(i+","+j+","+i%j);
//                         numAccepted++;
//                         }
//                     }
                    
//                 }
//             }
//             }
            
//             // System.out.println(memory[n]);
//             memory[n]=numAccepted;
//             System.out.println(numAccepted);
//         }
//     }
// }
// // IMPLEMENT A MEMOIZATION BASED SOLUTION. SOLN FOR N+1 WILL HAVE SAME ELEMENTS FOR N PLUS SOME EXTRA
// // ABOVE IMPLEMENTATION NOT WORKING WELL
// // DP[0]=0
// // DP[1]=1
// // DP[2]=1+DP[1]=2
// // DP[3]=2+DP[2]=3
// // DP[4]=3+DP[3]=6
// // DP[N] = CALC(I)+DP[N-1];
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class SPCTRIPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            int n=Integer.parseInt(br.readLine());
            int numAccepted=0;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j+=i) {
                    if (j%i==0) {
                        for (int k = i; k <= n; k+=j) {
                            if (k%j==i) {
                                numAccepted++;
                            }
                        }
                    }
                }
            }
            System.out.println(numAccepted);
        }
    }
}
