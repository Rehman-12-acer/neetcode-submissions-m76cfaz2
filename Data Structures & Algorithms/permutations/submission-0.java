class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res= new ArrayList<>();
        backtrack(nums,res,new ArrayList<>());
        return res;
    }
    private void backtrack(int [] nums,List<List<Integer>> res,
    List<Integer> cur)
    {
        if(cur.size()==nums.length)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int num: nums)
        {
            if(cur.contains(num)) continue;
            cur.add(num);
            backtrack(nums,res,cur);
            cur.remove(cur.size()-1);
        }
    }
}
