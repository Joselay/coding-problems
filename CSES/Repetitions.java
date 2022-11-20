import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String str = sc.next();
        String[] strs = str.split("");
        int t = 1, res = 1;
        String prev = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].equals(prev))
                t++;
            else {
                t = 1;
                prev = strs[i];
            }
            if (t > res)
                res = t;
        }
        System.out.println(res);
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
