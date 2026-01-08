package boj.timecomplexity.p24265;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;

        for (long i = N - 1; i >= 1; i--) sum += i;

        System.out.print(sum + "\n" + 2);
    }
}