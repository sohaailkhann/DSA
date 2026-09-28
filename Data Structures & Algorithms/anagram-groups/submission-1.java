class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s: strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String x=new String(c);
            res.putIfAbsent(x,new ArrayList<>());
            res.get(x).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
