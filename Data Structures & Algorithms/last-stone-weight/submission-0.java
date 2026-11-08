class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> x=new ArrayList<>();
        for(int s: stones){
            x.add(s);
        }
        while(x.size()>1){
            Collections.sort(x);
            int curr=x.remove(x.size()-1) -x.remove(x.size()-1);
            if(curr!=0) x.add(curr);
        }
        return x.isEmpty() ? 0 : x.get(0);
    }
}

// 2,3,6,2,4
// 2,2,3,4,6
// 6-4=2
// 2,2,2,3
// 3-2=1
// 1,2,2
// 2-2=0
// 1