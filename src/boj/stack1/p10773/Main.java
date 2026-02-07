package boj.stack1.p10773;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();
        long sum = 0;
        int pre = 0;

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            if (K != 0) {
                stack.push(K);
                sum += K;
            } else {
                sum -= stack.pop();
            }
        }

        System.out.print(sum);
    }
}