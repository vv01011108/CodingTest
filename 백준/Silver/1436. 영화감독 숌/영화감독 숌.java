import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        String s = "";
        int i = 0;

        while(count != N) {
            s = String.valueOf(i);
            if (s.contains("666")) count++;
            i++;
        }

        System.out.print(s);
    }
}