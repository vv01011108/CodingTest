package boj.stack1.p9012;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < T; i++) {
            String N = br.readLine();

            for (int j = 0; j < N.length(); j++) {


                if (N.charAt(j) == '(') {
                    stack.push(N.charAt(j));
                } else if (N.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    } else {
                        stack.push(N.charAt(j));
                        break;
                    }
                }
            }

            if (stack.isEmpty()) sb.append("YES").append("\n");
            else {
                sb.append("NO").append("\n");
                stack.clear();
            }
        }

        System.out.print(sb);
    }
}