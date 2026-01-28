package boj.setmap.p10816;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());

        int token = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            token = Integer.parseInt(st.nextToken());

            if (map.containsKey(token)) {
                map.put(token, map.get(token) + 1);
            } else map.put(token, 1);
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            token = Integer.parseInt(st.nextToken());

            if (map.containsKey(token)) {
                sb.append(map.get(token)).append(" ");
            } else sb.append(0).append(" ");
        }

        System.out.print(sb);
    }
}