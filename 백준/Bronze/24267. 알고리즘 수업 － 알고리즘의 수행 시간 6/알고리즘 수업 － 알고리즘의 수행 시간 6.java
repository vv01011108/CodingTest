import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;

        for (long i = N - 2; i > 0; i--) {
            sum += i * (i + 1) / 2;
        }
        System.out.print(sum + "\n" + 3);
    }
}