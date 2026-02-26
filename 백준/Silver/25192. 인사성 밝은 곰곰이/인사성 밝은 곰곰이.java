import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (!hashSet.contains(name) && !name.equals("ENTER")) {
                count++;
                hashSet.add(name);
            } else if (name.equals("ENTER")) {
                hashSet.clear();
            }
        }

        System.out.print(count);
    }
}