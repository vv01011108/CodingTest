package boj.combinatorics.p11050;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int n = 1;
        for (int i = 2; i <= N; i++) {
            n *= i;
        }

        int k = 1;
        for (int i = 2; i <= K; i++) {
            k *= i;
        }

        int minus = 1;
        for (int i = 2; i <= N - K; i++) {
            minus *= i;
        }

        System.out.print(n / (k * minus));
    }
}
