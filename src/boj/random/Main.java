package boj.random;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // * = 42, 0 = 48
        int[] arr = new int[13];
        String input = br.readLine();

        int sum = 0;
        int m = input.charAt(12) - '0';
        int xindex = 0;

        for (int i = 0; i < 12; i++) {
            arr[i] = input.charAt(i) - '0';
            if (arr[i] != -6) {
                if (i % 2 == 0) { // 짝수
                    sum += arr[i];
                } else { // 홀수
                    sum += arr[i] * 3;
                }
            } else if (arr[i] == -6) {
                xindex = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (xindex % 2 == 0) {
                if ((sum + i + m) % 10 == 0) {
                    arr[xindex] = i;
                }
            } else {
                if ((sum + i * 3 + m) % 10 == 0) {
                    arr[xindex] = i;
                }
            }
        }
        System.out.print(arr[xindex]);
    }
}