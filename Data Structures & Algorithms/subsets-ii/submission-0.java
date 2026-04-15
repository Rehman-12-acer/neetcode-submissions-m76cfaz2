class Solution {
    Set<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res= new HashSet<>();
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return new ArrayList<>(res);
    }
    private void backtrack(int [] nums,int i,List<Integer> cur)
    {
        if(i==nums.length)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        backtrack(nums,i+1,cur);
        cur.remove(cur.size()-1);
        backtrack(nums,i+1,cur);
    }
}
