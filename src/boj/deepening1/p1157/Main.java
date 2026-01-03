package boj.p1157; // 52 min
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] inputArray = input.toCharArray();
        int[] alpha = new int[26];

        for(int i = 0; i < inputArray.length; i++){
            if (inputArray[i] >= 'a' &&  inputArray[i] <= 'z') {
                // 소문자
                alpha[inputArray[i] - 'a']++;
            } else if (inputArray[i] >= 'A' &&  inputArray[i] <= 'Z') {
                //대문자
                alpha[inputArray[i] - 'A']++;
            }
        }

        int max = -1; // 제일 많이 나오는 인덱스의 횟수
        int index = 0; // 제일 많이 나오는 인덱스
        int repeatCheckMax = 0; // 중복되는 최댓값이라면 그 max

        // aAbB

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                index = i;
            } else if (alpha[i] == max) {
                repeatCheckMax = max;
            }
        }

        if (repeatCheckMax == max) {
            System.out.print("?");
        } else System.out.print((char) ( index + 'A'));

    }
}