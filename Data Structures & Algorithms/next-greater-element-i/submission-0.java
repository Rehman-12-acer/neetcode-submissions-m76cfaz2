class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            mp.put(nums2[i],i);
        }

        int [] a= new int [nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int x= nums1[i];

            int index=mp.get(x);
            int max=-1;
            for(int k=index+1;k<nums2.length;k++)
            {
                if(x<nums2[k])
                {
                    max=nums2[k];
                    break;
                }
            }
            a[i]=max;
        }
        return a;
    }

}