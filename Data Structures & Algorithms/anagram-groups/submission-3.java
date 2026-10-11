class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();

        for(String str : strs)
        {
            char [] ch= str.toCharArray();
            Arrays.sort(ch);
            String wrd= new String(ch);
            mp.computeIfAbsent(wrd,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
