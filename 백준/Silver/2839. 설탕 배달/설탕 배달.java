import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int five = N / 5;

        for (int i = 0; i <= N / 5; i++) {
            if ((N - (5 * five)) % 3 == 0) {
                int three = (N - (5 * five)) / 3;
                System.out.print(five + three);
                return;
            } else five--;
        }

        System.out.print(-1);
    }
}