package boj.random.p1284;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = String.valueOf(N);
        StringBuilder sb = new StringBuilder();

        while (N != 0) {
            char a = ' ';
            int sum = 2;

            for (int i = 0; i < s.length(); i++) {
                a = s.charAt(i);

                if (a == '1') {
                    sum += 2;
                } else if (a == '0') {
                    sum += 4;
                } else sum += 3;

            }

            sb.append(s.length() - 1 + sum)
                    .append("\n");

            N = Integer.parseInt(br.readLine());
            s = String.valueOf(N);
        }

        System.out.println(sb);
    }
}