class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();  // O(1)
        for(int n:nums) mp.put(n,mp.getOrDefault(n,0)+1); //O(n)

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a)); // O(1)
        for(int num : mp.keySet()) pq.offer(num); // for offer in PQ id O(log n). for num iterations 
        // O(m log m)

        int[] result=new int[k]; 

        for(int i=0;i<k;i++){
            result[i]=pq.poll();  // for Poll in PQ is O(log n) , for Polling K records . O(k log m)
        }
        return result;

        /* TC: O(n) + O(m log m) + O(k log m)
           since k<m == - O(k log m)
           O(n) + O(m log m)
           O(n + m log m)
           SP: O(m)
        */

    }
}
