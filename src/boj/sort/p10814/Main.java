package boj.sort.p10814;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        Arrays.sort(arr, (a, b) -> {
            if (!a[0].equals(b[0])) {
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            } else {
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}