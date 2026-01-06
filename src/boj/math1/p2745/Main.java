package boj.math1.p2745; // 50m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char N = s.charAt(i);
            if ('0' <= N && N <= '9') {
                sum += (int)Math.pow(B, s.length() - i - 1) * (N - '0');
            } else if ('A' <= N && N <= 'Z') {
                sum += (int)Math.pow(B, s.length() - i - 1) * (N - 'A' + 10);
            }
        }

        System.out.print(sum);
    }
}