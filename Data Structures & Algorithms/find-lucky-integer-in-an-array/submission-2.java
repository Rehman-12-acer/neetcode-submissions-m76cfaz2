class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res=-1;
        for(int a : arr)
        {
            mp.put(a,mp.getOrDefault(a,0)+1);
        }

        for(int i : mp.keySet())
        {
            if(i==mp.get(i))
            {
                res=Math.max(res,i);
            }
        }
        return res;
    }
}