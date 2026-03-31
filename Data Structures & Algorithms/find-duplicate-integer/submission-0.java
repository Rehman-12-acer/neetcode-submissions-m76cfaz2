class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map= new HashSet<>();
        int dup=0;

        for(int num: nums)
        {
            if(map.contains(num))
            {
                dup=num;
            }
            map.add(num);
        }
        return dup;
    
    }
}
