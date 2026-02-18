package boj.stack1.p2346;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(st.nextToken());
            deque.addLast(new int[]{i, x});
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] curr = deque.peekFirst();
            sb.append(curr[0]).append(" ");
            deque.pollFirst();

            if (!deque.isEmpty()) {
                if (curr[1] > 0) {
                    for (int j = 0; j < curr[1] - 1; j++) {
                        deque.addLast(deque.pollFirst());
                    }
                } else if (curr[1] < 0) {
                    for (int j = curr[1]; j < 0; j++) {
                        deque.addFirst(deque.pollLast());
                    }
                }
            }
        }

        System.out.print(sb);
    }
}