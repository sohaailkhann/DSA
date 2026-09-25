class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ss=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1=new String(ch);
            mp.putIfAbsent(s1,new ArrayList<>());
            mp.get(s1).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
