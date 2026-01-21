package boj.setmap.p7785;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (state.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> arr = new ArrayList<>(set);
        arr.sort(Collections.reverseOrder());

        for (String x : arr) {
            System.out.println(x);
        }
    }
}
