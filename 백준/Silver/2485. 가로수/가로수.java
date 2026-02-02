import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] x = new int[N - 1];

        arr[0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            x[i - 1] = arr[i] - arr[i - 1];
        }

        int A = x[1];
        int B = x[0];
        for (int i = 1; i < N - 1; i++) {

            while(B != 0) {
                int tmp = B;
                B = A % B;
                A = tmp; // 남는 것
            }

            B = A;
            if (i + 1 < N - 1) {
                A = x[i + 1];
            } else break;
        }

        int count = 0;
        for (int i = 1; i <= N - 1; i++) {
            if ((arr[i] - arr[i - 1])> B) {
                count += (arr[i] - arr[i - 1]) / B - 1;
            }
        }

        System.out.print(count);
    }
}