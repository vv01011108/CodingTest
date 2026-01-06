package boj.math1.p1193; // 1h 30m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int diagonal = 1; // 대각선
        int sum = 1; // 대각선 누적 합
        int num = 0; // 대각선에서 몇 번째 위치

        while (N > sum) {
            sum += diagonal + 1;
            diagonal++;
        }

        num = N - (sum - diagonal);

        int a = 0, A = 0;
        if (diagonal % 2 == 0) {
            a = num;
            A = diagonal - num + 1;
        } else if (diagonal % 2 == 1) {
            a = diagonal - num + 1;
            A = num;
        }
        System.out.print(a + "/" + A);
    }
}
