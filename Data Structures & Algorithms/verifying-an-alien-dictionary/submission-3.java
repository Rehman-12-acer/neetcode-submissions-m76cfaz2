class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> mp= new HashMap<>();
        int count=1;
        for(char c : order.toCharArray())
        {
            mp.put(c,count);
            count++;
        }

        for(int i=0;i<words.length-1;i++)
        {
            String word1=words[i],word2=words[i+1];
            int j=0;

            for(;j<word1.length();j++)
            {
                if(j==word2.length()) return false;

                if(word1.charAt(j)!=word2.charAt(j))
                {
                    if(mp.get(word1.charAt(j))>mp.get(word2.charAt(j)))
                    {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }
}