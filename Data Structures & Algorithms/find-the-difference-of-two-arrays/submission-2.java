class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int num: nums1)
        {
            s1.add(num);
        }
        for(int num: nums2)
        {
            s2.add(num);
        }
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        
        for(int num :nums1)
        {
            if(!s2.contains(num)&&!l1.contains(num))
            {
                l1.add(num);
            }
        }
        for(int num : nums2)
        {
            if(!s1.contains(num)&&!l2.contains(num))
            {
                l2.add(num);
            }
        }
        res.add(l1);
        res.add(l2);
        return res;
    }
}