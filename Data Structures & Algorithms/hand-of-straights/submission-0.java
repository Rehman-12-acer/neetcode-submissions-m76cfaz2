class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num: hand)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Arrays.sort(hand);

        for(int num :hand)
        {
            if(mp.get(num)>0)
            {
                for(int i= num;i<num+groupSize;i++)
                {
                    if(mp.getOrDefault(i,0)==0) return false;
                    mp.put(i,mp.get(i)-1);
                }
            }
        }
        return true;
    }
}
