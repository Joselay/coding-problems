class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> output = new ArrayList<>();

        Map<String,PriorityQueue<String>> map = new HashMap<>();
        for(List<String> ticket : tickets){
            PriorityQueue q = map.getOrDefault(ticket.get(0),new PriorityQueue<String>());
            q.offer(ticket.get(1));
            map.put(ticket.get(0),q);
        }
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while(!stack.isEmpty()){
            String cur = stack.peek();
            PriorityQueue<String> pq = map.get(cur);
            if(pq == null || pq.size()==0)
                output.add(stack.pop());
            else
                stack.push(pq.poll());
        }
        Collections.reverse(output);
        return output;
    }
    
}
