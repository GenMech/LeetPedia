class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
           map.put(words[i], map.getOrDefault(words[i],0) + 1);
        }
        
        List<String> ans = new ArrayList<>(map.keySet());
        
        Collections.sort(ans, (A1, A2) ->  
                        map.get(A1) == map.get(A2) ? 
                        A1.compareTo(A2) : 
                        map.get(A2) - map.get(A1));
        
        return ans.subList(0, k);
    }
}