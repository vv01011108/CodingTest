import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = 0;
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < N - 1; i++) {
            M = i;

            int tmp = i;
            sum = 0;

            while (tmp > 0) { // 자릿수 합 누적
                sum += tmp % 10;
                tmp /= 10;
            }

            if (N == (M + sum)) {
                System.out.print(M);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.print(0);
        }
    }
}
