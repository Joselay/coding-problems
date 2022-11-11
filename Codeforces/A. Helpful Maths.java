import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//https://codeforces.com/problemset/problem/339/A
public class Main {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        String str = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<str.length();i++)
            if(i%2==0)
                arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        Collections.sort(arr);
        String res = arr.stream().map(Object::toString).collect(Collectors.joining("+"));
        System.out.println(res);
    }
}
