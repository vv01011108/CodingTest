package boj.p10809;

import java.util.*;
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] input = s.toCharArray();

        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        int[] output = new int[26];
        Arrays.fill(output, -1);

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (input[i] == alphabet[j] && output[j] == -1) {
                    output[j] = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < output.length; i++) {
            sb.append(output[i] + " ");
        }

        System.out.print(sb);

    }
}
