class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max=0;
        int res=Integer.MIN_VALUE;
        for(int num : nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
            if(mp.get(num)>max)
            {
                res=num;
                max=mp.get(num);
            }

        }
        return res;
    }
}