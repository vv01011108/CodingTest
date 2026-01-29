import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Set<String> set = new HashSet<>();

        int len = S.length() * (S.length() + 1) / 2;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < S.length(); j++) {
                set.add(S.substring(i, j + 1));
            }
        }

        System.out.print(set.size());
    }
}