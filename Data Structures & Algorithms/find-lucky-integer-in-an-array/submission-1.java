class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num : arr)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int res=-1;
        for(Map.Entry<Integer,Integer> map : mp.entrySet())
        {
            int x=map.getKey();
            int y=map.getValue();
            if(x==y)
            {
                res=Math.max(res,x);
            }
        }
        return res;
    }
}