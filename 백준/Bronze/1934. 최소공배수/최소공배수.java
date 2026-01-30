import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int AA = A;
            int B = Integer.parseInt(st.nextToken());
            int BB = B;

            while (B != 0) {
               int r = A % B;
               A = B;
               B = r;
            }

            sb.append((AA/A) * (BB/A) * A).append("\n");
        }

        System.out.print(sb);
    }
}