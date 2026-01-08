package boj.prime1.p9506; // 1h 30m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> small = new ArrayList<Integer>();
        ArrayList<Integer> big = new ArrayList<Integer>();

        while(true) {
            StringBuilder line = new StringBuilder(); // 임시 버퍼
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;

            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    if (i == N / i) {
                        small.add(i);
                    } else {
                        small.add(i);
                        big.add(N / i);
                    }
                }
            }

            int sum = 1;

            for (int i = 0; i < small.size(); i++) {
                sum += small.get(i);
                line.append(" + ").append(small.get(i));
            }

            for (int i = 0; i < big.size(); i++) {
                sum += big.get(big.size() - 1- i);
                line.append(" + ").append(big.get(big.size() - 1- i));
            }

            // 완전수 확인
            if (N == sum) {
                sb.append(N).append(" = 1")
                        .append(line);
            } else {
                sb.append(N).append(" is NOT perfect.");
            }
            sb.append("\n");
            small.clear();
            big.clear();
        }
        System.out.print(sb);

    }
}
