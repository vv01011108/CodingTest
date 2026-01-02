package boj.p1316; // 1h 30m

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int group = 0;


        for (int i = 0; i < N; i++) {
            boolean b = false; // 멀리 중복이면 true

            char[] inputArray = br.readLine().toCharArray();

            for (int j = 1; j <= inputArray.length; j++) {
                if (j < inputArray.length && inputArray[j - 1] != inputArray[j]) {

                    // 하나 기준으로 떨어져 있는 거 중복 확인
                    for (int k = j+1; k < inputArray.length; k++) {
                        if (inputArray[j - 1] == inputArray[k]) {
                            b = true;
                            break;
                        }
                    }

                } else if (j == 1 && j == inputArray.length)  {
                    group++;
                    b = true;
                }
            }
            if (!b) group++;
        }

        System.out.print(group);
    }
}