import java.io.*;
import java.util.*;
class PALINT {
    public static int[] findMax(int x, int[] arr) {
        HashMap<Integer,Integer> counter = new HashMap<>();
        HashMap<Integer,Integer> operations = new HashMap<>();
        for(int num: arr) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            operations.put(num, 0);
        }
        for(int num: arr) {
            if(x == 0) {
                break;
            }
            int xorResult = num ^ x;
            counter.put(xorResult, counter.getOrDefault(xorResult, 0) + 1);
            operations.put(xorResult, operations.getOrDefault(xorResult, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        int max = 1;
        for(Map.Entry<Integer, Integer> entry: counter.entrySet()){
            if(max < entry.getValue()) {
                max = entry.getValue();
                list.clear();
                list.add(entry.getKey());
            } else if (max == entry.getValue()){
                list.add(entry.getKey());
            }
        }
        int minOperation = Integer.MAX_VALUE;
        for(int num: list) {
            minOperation = Math.min(minOperation, operations.get(num));
        }
        return new int[]{max, minOperation};
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc>0)
        {
            tc--;
            String nx[] = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            String[] ar = br.readLine().split(" ");
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(ar[i]);
            }
            int[] res = findMax(x, arr);
            System.out.println(res[0]+" "+res[1]);
        }
    }
}