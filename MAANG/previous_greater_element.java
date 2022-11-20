import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int arr[] = {20, 30, 10, 5, 15}; //Test
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(arr[0]);
        int pg = -1;
        System.out.print(pg + " ");
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();
            pg = (stack.isEmpty()) ? -1 : stack.peek();
            System.out.print(pg + " ");
            stack.push(arr[i]);
        }
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
