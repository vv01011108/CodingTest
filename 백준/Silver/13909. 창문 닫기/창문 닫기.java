import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long n = 1;
        int count = 0;
        while (n * n <= N) {
            count++;
            n++;
        }

        System.out.print(count);
    }
}