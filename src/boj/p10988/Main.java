package boj.p10988;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char [] inputArray = input.toCharArray();

        int center = 0;
        center = inputArray.length / 2;

        int sum = 0;

        for (int i = 0; i < center; i++) {
            if (inputArray[i] == inputArray[inputArray.length - i - 1]) {
                sum++;
            }
        }

        if (sum == center) {
            System.out.print(1);
        } else System.out.print(0);
    }
}
