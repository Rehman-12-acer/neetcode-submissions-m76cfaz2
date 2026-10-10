class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s= new HashSet<>();

        for(int a : nums)
        {
            if(s.contains(a))
            {
                return true;
            }
            s.add(a);
        }
        return false;
    }
}