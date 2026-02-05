package boj.prime2.p17103;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int MAX = 1000000;
        boolean[] arr = new boolean[MAX + 1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            for (int j = i * i; j <= MAX; j += i) {
                arr[j] = false;
            }
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= N / 2; j++) {
                if (arr[j] && arr[N - j]) count++;
            }

            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }
}