class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        backtrack(0,nums,res,sub);
        return res;
    }
    private void backtrack(int i,int [] nums,List<List<Integer>> res,
    List<Integer> sub)
    {
         if(i>=nums.length)
         {
            res.add(new ArrayList<>(sub));
            return;
         }
        sub.add(nums[i]);
        backtrack(i+1,nums,res,sub);
        sub.remove(sub.size()-1);
        backtrack(i+1,nums,res,sub);
    }
}
