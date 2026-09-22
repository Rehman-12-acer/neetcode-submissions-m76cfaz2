class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res=0;
        for(int c : nums)
        {
            res+=mp.getOrDefault(c,0);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        return res;
    }
}