import java.util.*;
import java.io.*;
import java.math.*;

public class pot {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        int sum=0;
        while(t-->0){
            String n = sc.next();
            int last = Integer.parseInt(n)%10;
            int conv = Integer.parseInt(n.substring(0,n.length()-1));
            sum+=Math.pow(conv,last);

        }
        System.out.println(sum);
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
