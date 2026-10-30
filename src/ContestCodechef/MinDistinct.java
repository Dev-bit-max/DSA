package ContestCodechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            HashMap<Integer, Integer> a = new HashMap<>();
            for (int i : arr) {
                a.put(i, a.getOrDefault(i, 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> q = new ArrayList<>(a.entrySet());
            Collections.sort(q, (b, c) -> c.getValue() - b.getValue());
            int distinct=q.size();

            for (int i = 0; i <q.size();i++){
                int freq=q.get(i).getValue();
                int extra=freq-1;
                int remove=Math.min(extra,K);
                K=K-remove;
                freq=freq-remove;
                q.get(i).setValue(freq);
                if(K==0){break;}
            }
            System.out.println(a.size());
        }
    }
}

