class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n=words.length;
        HashSet<Character> [] s1= new HashSet[n];

        for(int i=0;i<n;i++)
        {
            s1[i]=new HashSet<>();
            String wrd=words[i];
            for(char c : wrd.toCharArray())
            {
                s1[i].add(c);
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            boolean flag= true;

            for(char c : s1[i])
            {
                if(allowed.indexOf(c)==-1)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
}