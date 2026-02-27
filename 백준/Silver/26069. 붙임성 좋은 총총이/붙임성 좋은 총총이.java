import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if (A.equals("ChongChong")) {
                hashSet.add(B);
            } else if (B.equals("ChongChong")) {
                hashSet.add(A);
            }

            if (hashSet.contains(A)) {
                hashSet.add(B);
            } else if (hashSet.contains(B)) {
                hashSet.add(A);
            }
        }

        System.out.print(hashSet.size());
    }
}