class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int res=0;
        for(int n : nums){
            if(!mp.containsKey(n)){
                int left=(mp.containsKey(n-1)) ? mp.get(n-1) : 0;
                int right=(mp.containsKey(n+1)) ? mp.get(n+1) : 0;
                int sum= left+right+1;
                mp.put(n,sum);
                mp.put(n-left,sum);
                mp.put(n+right,sum);
                res=Math.max(res,sum);
            }else{
                continue;
            }
        }
        return res;
    }
}
