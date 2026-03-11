package boj.recursion.p10870;

import java.io.*;

public class Main {

    public static int fibon(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibon(n - 1) + fibon(n - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.print(fibon(N));
    }
}