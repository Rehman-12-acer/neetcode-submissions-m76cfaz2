class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res= new ArrayList<>();
        Arrays.sort(candidates);
        dp(0,target,candidates,0,new ArrayList<>());
        return res;
    }

    private void dp(int i,int tar,int [] can,int sum,List<Integer> cur)

    {
        if(tar==sum)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(sum>tar||i==can.length)
        {
            return; 
        }
        cur.add(can[i]);
        dp(i+1,tar,can,sum+can[i],cur);
        cur.remove(cur.size()-1);

        while(i+1<can.length&&can[i]==can[i+1])
        {
            i++;
        }
        dp(i+1,tar,can,sum,cur);
    }
}
