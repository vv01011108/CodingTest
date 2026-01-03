package boj.TwoDimArray.p2738;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] sum = new int[N][M];

        int step = 0;
        while (step < 2) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    sum[i][j] += Integer.parseInt(st.nextToken());
                }
            }
            step++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(sum[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}