class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1= new HashMap<>();
        HashMap<Character,Integer> mp2= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            char y=t.charAt(i);
            mp1.put(x,mp1.getOrDefault(x,0)+1);
            mp2.put(y,mp2.getOrDefault(y,0)+1);
        }
        return mp1.equals(mp2);
    }
}
