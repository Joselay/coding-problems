import java.io.*;
import java.util.*;
// Problem : https://codeforces.com/contest/1742/problem/A
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
        int t = sc.nextInt();
        while(t-->0){
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<3;i++){
                int n = sc.nextInt();
                al.add(n);
            }
            al.sort(Comparator.naturalOrder());
            Set<Integer> s= new LinkedHashSet<>();
            s.addAll(al);
            if(al.get(0) + al.get(1) == al.get(2)&& s.size()!=1)
                System.out.println("YES");
            else if(al.get(0)==0 && al.get(1)==0 && al.get(2)==0)
                System.out.println("YES");
            else
                System.out.println("NO");
            al.clear();
            s.clear();
        }
    }
}
