package boj.stack1.p4949;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String N = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();

            if (!N.equals(".")) {
                for (int i = 0; i < N.length(); i++) {
                    if (N.charAt(i) != '.') {
                        if ((N.charAt(i) == '(') || (N.charAt(i) == '[')) {
                            stack.push(N.charAt(i));
                        } else if (N.charAt(i) == ')' ) {
                            if (!stack.isEmpty() && (stack.peek() == '(')) {
                                stack.pop();
                            } else {
                                stack.push(N.charAt(i));
                                break;
                            }
                        } else if (N.charAt(i) == ']') {
                            if (!stack.isEmpty() && (stack.peek() == '[')) {
                                stack.pop();
                            } else {
                                stack.push(N.charAt(i));
                                break;
                            }
                        }
                    }
                }

                if (stack.isEmpty()) sb.append("yes").append("\n");
                else sb.append("no").append("\n");

                stack.clear();
            } else break;
        }

        System.out.print(sb);
    }
}