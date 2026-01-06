package boj.math1.p2903; // 40m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int row= 3;

        if (N != 1) {
            for (int i = 1; i < N; i++) {
                row += row - 1;
            }
        }

        System.out.print(row * row);
    }
}