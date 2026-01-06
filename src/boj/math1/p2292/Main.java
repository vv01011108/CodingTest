package boj.math1.p2292; // 30m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int sum = 1;
        int N = 1;

        while (input > sum) {
            sum += 6 * N;
            N++;
        }
        System.out.print(N);
    }
}