package boj.prime1.p2581; // 40m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        boolean[] prime = new boolean[N + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }

        }

        if (sum == 0) {
            System.out.print(-1);
        } else System.out.print(sum + "\n" + min);

    }
}
