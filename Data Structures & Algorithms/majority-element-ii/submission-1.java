class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num : nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int n=nums.length;
        int m=n/3;
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            if(entry.getValue()>m)
            {
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}