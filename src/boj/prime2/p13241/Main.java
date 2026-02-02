package boj.prime2.p13241;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long AA = A;
        long BB = B;

        while(B != 0) {
            long tmp = B;
            B = A % B;
            A = tmp;
        }

        System.out.print(A * (AA/A) * (BB/A));
    }
}