class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //better space complexity

        HashSet<Character> s1= new HashSet<>();

        for(char c : allowed.toCharArray())
        {
            s1.add(c);
        }

        int res=words.length;

        for(String wrd : words)
        {
            for(char c : wrd.toCharArray())
            {
                if(!s1.contains(c))
                {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}