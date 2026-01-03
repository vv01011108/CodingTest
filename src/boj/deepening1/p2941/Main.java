package boj.p2941; // 50m

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] inputArray = input.toCharArray();

        // 크로아티어 문자 총 17개로 구성, 변환 덩어리는 8개
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int croCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (i + 1 < inputArray.length) {
                if (i + 2 < inputArray.length && inputArray[i] == 'd' && inputArray[i + 1] == 'z' && inputArray[i + 2] == '=') {
                    croCount++;
                    i += 2;
                } else if (inputArray[i] == 'c' && inputArray[i + 1] == '-') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 'c' && inputArray[i + 1] == '=') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 'd' && inputArray[i + 1] == '-') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 'l' && inputArray[i + 1] == 'j') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 'n' && inputArray[i + 1] == 'j') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 's' && inputArray[i + 1] == '=') {
                    croCount++;
                    i++;
                } else if (inputArray[i] == 'z' && inputArray[i + 1] == '=') {
                    croCount++;
                    i++;
                } else {
                    croCount++;
                }
            } else if (i + 1 == inputArray.length) {
                croCount++;
            }
        }
        System.out.print(croCount);
    }
}
