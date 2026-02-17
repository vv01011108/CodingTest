package boj.stack1.p28279;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());

            if (x1 == 1) {
                int x2 = Integer.parseInt(st.nextToken());
                deque.addFirst(x2);

            } else if (x1 == 2) {
                int x2 = Integer.parseInt(st.nextToken());
                deque.addLast(x2);
            }

            switch (x1) {
                case 3:
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollLast()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case 8:
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}