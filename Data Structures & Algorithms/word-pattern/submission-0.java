class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words=s.split(" ");
        if(words.length!=pattern.length()) return false;
        Map<Character,String> chtow= new HashMap<>();
        Map<String,Character> wtoch= new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c= pattern.charAt(i);
            String word=words[i];

            if(chtow.containsKey(c)&&!chtow.get(c).equals(word)) return false;
            if(wtoch.containsKey(word)&&wtoch.get(word)!=c) return false;

            chtow.put(c,word);
            wtoch.put(word,c);
        }
        return true;
   }
}