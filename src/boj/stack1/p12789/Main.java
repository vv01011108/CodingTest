package boj.stack1.p12789;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        int curr = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (x == curr) {
                curr++;

                while(!stack.isEmpty() && stack.peek() == curr) {
                    stack.pop();
                    curr++;
                }
            }
            else {
                stack.push(x);
            }
        }

        for (int j = curr; j <= N; j++) {
            if (!stack.isEmpty() && stack.peek() == j) stack.pop();
        }

        if (stack.isEmpty()) System.out.print("Nice");
        else System.out.print("Sad");
    }
}