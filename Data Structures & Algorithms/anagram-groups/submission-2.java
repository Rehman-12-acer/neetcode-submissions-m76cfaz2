class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        HashMap<String,List<String>> mp= new HashMap<>();

        for(String str: strs)
        {
            char [] word= str.toCharArray();
            Arrays.sort(word);
            String word2= new String(word);
            mp.computeIfAbsent(word2,k->new ArrayList<>()).add(str);
        }
        for(List<String> strl:mp.values())
        {
            res.add(strl);
        }
        return res;
    }
}
