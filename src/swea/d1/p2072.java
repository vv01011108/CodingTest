package swea.d1;

import java.io.*;
import java.util.*;

public class p2072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            int sum = 0;

            st =  new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x % 2 != 0) {
                    sum += x;
                }
            }

            sb.append("#" + i + " " + sum).append("\n");
        }

        System.out.print(sb);
    }

}
