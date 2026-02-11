package boj.stack1.p18258;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();



        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();

            int x;
            if (word.equals("push")) {
                x = Integer.parseInt(st.nextToken());
                queue.add(x);
            }

            switch (word) {
                case "pop":
                    if (!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) sb.append(queue.peekLast()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }
}