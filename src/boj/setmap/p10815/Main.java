package boj.setmap.p10815;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sb.append(set.contains(Integer.parseInt(st.nextToken())) ? "1" : "0")
                    .append(" ");
        }

        System.out.print(sb);
    }
}