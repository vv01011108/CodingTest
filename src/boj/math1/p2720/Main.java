package boj.math1.p2720; // 20m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            quarter = input / 25;
            dime = (input % 25) / 10;
            nickel = (input % 25 % 10) / 5;
            penny = input % 25 % 10 % 5;

            sb.append(quarter).append(" ")
                    .append(dime).append(" ")
                    .append(nickel).append(" ")
                    .append(penny).append("\n");
        }

        System.out.print(sb);
    }
}