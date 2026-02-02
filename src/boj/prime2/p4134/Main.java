package boj.prime2.p4134;

import java.io.*;
import java.util.*;

public class Main {

    // 소수 판별
    static boolean isPrime(long n) {

        if (n > 2) {
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } else if (n == 2) {
            return true;
        } else if (n == 0 || n == 1) return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());

            while (true) {
                if (isPrime(N)) {
                    sb.append(N).append("\n");
                    break;
                }
                N++;
            }
        }

        System.out.print(sb);
    }
}