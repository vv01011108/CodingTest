package boj.prime2.p1735;

import java.io.*;
import java.util.*;

public class Main {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        // 분모
        int m = B * D;

        // 분자
        int n = A * D + B * C;

        // 약분
        while (n != 0) {
            int tmp = n;
            n = m % n;
            m = tmp;
        }

        System.out.print((A * D + B * C) / m + " " + (B * D) / m);
    }
}