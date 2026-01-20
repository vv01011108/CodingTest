import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

        int[] countArr = new int[N];
        int count = 0;
        int prev = arr[0][0];
        countArr[arr[0][1]] = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i][0] != prev) {
                count++;
                prev = arr[i][0];
            }
            countArr[arr[i][1]] = count;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(countArr[i]).append(" ");
        }

        System.out.print(sb);
    }
}