class Solution {
    public boolean canFinish(int courses, int[][] pre) {
        if(pre==null || pre.length==0)
            return true;
        int[] inDegree = new int[courses];
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<pre.length;i++){
            inDegree[pre[i][0]]++;
            if(!map.containsKey(pre[i][1])){
                List<Integer> cur = new ArrayList<>();
                cur.add(pre[i][0]);
                map.put(pre[i][1],cur);
            }else{
                map.get(pre[i][1]).add(pre[i][0]);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<inDegree.length;i++)
            if(inDegree[i]==0)
                queue.add(i);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            List<Integer> list = map.get(cur);
            for(int x =0;list!=null&&x<list.size();x++){
                inDegree[list.get(x)]--;
                if(inDegree[list.get(x)]==0)
                    queue.add(list.get(x));
            }
        }
        for(int i : inDegree)
            if(i!=0)
                return false;
        return true;
    }
}
