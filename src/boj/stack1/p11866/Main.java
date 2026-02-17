package boj.stack1.p11866;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int j = 1; j < K; j++) {
                queue.addLast(queue.pollFirst());
            }

            sb.append(queue.poll());

            if (!queue.isEmpty())
                sb.append(", ");
        }

        System.out.print("<" + sb + ">");
    }
}