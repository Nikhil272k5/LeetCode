class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>>hp = new HashMap<>();
        for(List<String>h : tickets){
            String start = h.get(0);
            String end = h.get(1);
            
            hp.putIfAbsent(start,new PriorityQueue<>());
            hp.get(start).add(end);
        }
        List<String>ans = new ArrayList<>();
       
        dfs("JFK",hp,ans);
        return ans;

    }
    
    private static void dfs(String temp,HashMap<String,PriorityQueue<String>>hp,List<String>ans){
        PriorityQueue<String>p = hp.get(temp);
        while(p!=null && !p.isEmpty()){
            dfs(p.poll(),hp,ans);
        }
        ans.addFirst(temp);
    }
}