package boj.deepending2.p20920;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            if (word.length() >= M) {
                hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort((a, b) -> {
            int c = Integer.compare(b.getValue(), a.getValue());
            if (c != 0) return c;

            c = Integer.compare(b.getKey().length(), a.getKey().length());
            if (c != 0) return c;

            return a.getKey().compareTo(b.getKey());
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> x : list) {
            sb.append(x.getKey()).append("\n");
        }

        System.out.print(sb);
    }
}