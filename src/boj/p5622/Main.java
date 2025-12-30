package boj.p5622;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 문자열
        String input = br.readLine();
        char [] inputArray = input.toCharArray();

        int [] number = { 3,3,3, 4,4,4, 5,5,5,
                6,6,6, 7,7,7, 8,8,8,8, 9,9,9, 10,10,10,10 };

        int sum = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (inputArray[i] == 'A' + j) {
                    sum += number[j];
                }
            }
        }

        System.out.print(sum);
    }
}
