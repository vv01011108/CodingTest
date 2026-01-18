package boj.bruteforce.p1018;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] board = new String[N];
        for (int i = 0; i < N; i++)
            board[i] = br.readLine();

        int answer = Integer.MAX_VALUE;

        for (int x = 0; x <= N - 8; x++) {
            for (int y = 0; y <= M - 8; y++) {

                int countW = 0;
                int countB = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board[x + i].charAt(y + j);

                        char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                        char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';

                        if (current != expectedW) countW++;
                        if (current != expectedB) countB++;
                    }
                }

                int localMin = Math.min(countW, countB);
                answer = Math.min(answer, localMin);
            }
        }

        System.out.print(answer);
    }
}