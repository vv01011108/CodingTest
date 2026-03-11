import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        if (M >= 45) {
            M = M - 45;
        } else if (M < 45) {
            M = 60 - (45 - M);
            if ( (0 < H) && (H < 24)) {
                H = H - 1;
            } else if (H == 0) {
                H = 23;
            }
        }





        StringBuilder sb = new StringBuilder();
        sb.append(H).append(" ").append(M);
        System.out.print(sb);

    }
}