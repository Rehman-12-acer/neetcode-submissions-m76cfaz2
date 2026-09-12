class Solution {
    public int maxNumberOfBalloons(String text) {
        String s= "balon";

        HashMap<Character,Integer> mp= new HashMap<>();
        for(char c : text.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int maxball=Integer.MAX_VALUE;
        for(char c :s.toCharArray())
        {
            int count=mp.getOrDefault(c,0);

            if(c=='l'||c=='o')
            {
                count/=2;
            }

            maxball=Math.min(maxball,count);
        }
        return maxball;
    }
}