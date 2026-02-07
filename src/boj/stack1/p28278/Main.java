package boj.stack1.p28278;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if (n == 1) {
                int x = Integer.parseInt(st.nextToken());
                dq.push(x);
            } else if (n == 2) {
                if (dq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pop()).append("\n");
                }
            } else if (n == 3) {
                sb.append(dq.size()).append("\n");
            } else if (n == 4) {
                if (dq.isEmpty()) {
                    sb.append(1).append("\n");
                } else sb.append(0).append("\n");
            } else if (n == 5) {
                if (!dq.isEmpty()) {
                    sb.append(dq.peek()).append("\n");
                } else sb.append(-1).append("\n");
            }
        }

        System.out.print(sb);
    }
}