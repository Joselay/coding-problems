import java.util.*;
import java.io.*;
import java.math.*;

public class ratingproblems {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n, k, r, s = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            r = sc.nextInt();
            s += r;
        }
        System.out.printf("%.4f %.4f\n", (s - 3.0 * (n - k)) / n, (s + 3.0 * (n - k)) / n);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
