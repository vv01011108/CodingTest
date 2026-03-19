package boj.random.p1075;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        int change = N / 100 * 100;

        for (int i = 0; i < 100; i++) {
            if (change % F == 0) {
                System.out.printf("%02d", change % 100);
                break;
            }
            change++;
        }
    }
}