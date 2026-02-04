import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int MAX = 264912;
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while(true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            int count = 0;
            for (int i = N + 1; i <= 2 * N; i++) {
                count += isPrime[i] ? 1 : 0;
            }

            System.out.println(count);
        }
    }
}