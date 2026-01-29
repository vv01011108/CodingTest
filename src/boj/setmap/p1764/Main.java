package boj.setmap.p1764;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> asc = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }


        String token = "";
        for (int i = 0; i < M; i++) {
            token = br.readLine();
            if (set.contains(token)) {
                asc.add(token);
            }
        }

        Collections.sort(asc);

        StringBuilder sb = new StringBuilder();
        for (String x : asc) {
            sb.append(x).append("\n");
        }

        System.out.print(asc.size() + "\n" + sb);
    }
}