import java.util.*;
import java.io.*;

public class Main {

    static boolean isPrime(int n) {

        if(n > 2) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } else if (n == 2) return true;
        else if (n == 0 || n == 1) return false;

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (N <= M) {
            if (isPrime(N)) {
                sb.append(N).append("\n");
            }

            N++;
        }

        System.out.print(sb);
    }
}