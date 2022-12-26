import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] g = new ArrayList[numCourses];
        int[] in = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] e : prerequisites) {
            g[e[1]].add(e[0]);
            in[e[0]]++;
        }
        int[] res = new int[numCourses];
        int idx = 0;
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                res[idx++] = i;
            }
        }
        for (int i = 0; i < idx; i++) {
            for (int neighbor : g[res[i]]) {
                if (--in[neighbor] == 0) {
                    res[idx++] = neighbor;
                }
            }
        }
        return idx == numCourses ? res : new int[0];
    }
}
