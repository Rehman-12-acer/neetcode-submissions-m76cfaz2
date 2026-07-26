class Solution {
    public int maxNumberOfBalloons(String text) {
        String a= "balloon";
        int [] freq= new int [26];
        for(char c : text.toCharArray())
        {
                freq[c-'a']++;
        }
        int [] freq2= new int [26];
        for(char c : a.toCharArray())
        {
            freq2[c-'a']++;
        }
        int count =text.length();
        for(char c : a.toCharArray())
        {
            count=Math.min(count,freq[c-'a']/freq2[c-'a']);
        }
        return count;
    }
}