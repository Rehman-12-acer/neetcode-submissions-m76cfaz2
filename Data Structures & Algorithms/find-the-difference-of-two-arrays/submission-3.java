class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res= new ArrayList<>();

        HashSet<Integer> s1= new HashSet<>();
        HashSet<Integer> s2= new HashSet<>();

        for(int n : nums1)
        {
            s1.add(n);
        }
        for(int n : nums2)
        {
            s2.add(n);
        }

        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();

        for(int s : s1)
        {
            if(s1.contains(s)&&s2.contains(s)) continue;

            else if(s1.contains(s)&&!s2.contains(s)) l1.add(s);
            else 
            {
                l2.add(s);
            }
        }
        for(int s : s2)
        {
            if(s1.contains(s)&&s2.contains(s)) continue;
            else if(!s1.contains(s)&&s2.contains(s)) l2.add(s);
            else
            {
                l1.add(s);
            }
        }
        res.add(l1);
        res.add(l2);
        return res;
    }
}