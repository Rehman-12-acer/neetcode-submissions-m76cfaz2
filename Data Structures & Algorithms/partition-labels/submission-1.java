class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            mp.put(s.charAt(i),i);
        }

        List<Integer> res= new ArrayList<>();
        int size=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            size++;
            int lastIndex=mp.get(s.charAt(i));
            end=Math.max(end,lastIndex);
            if(i==end)
            {
                res.add(size);
                size=0;
            }

        }
        return res;
    }
}
