class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        HashMap<Integer,Integer> mp2 = new HashMap<>();

        for(int ar: arr1)
        {
            mp.put(ar,mp.getOrDefault(ar,0)+1);
        }
        for(int art: arr2)
        {
            mp2.put(art,mp2.getOrDefault(art,0)+1);
        }
        List<Integer> x= new ArrayList<>();

        for(int ac : arr2)
        {
            int count=mp.get(ac);
            while(count>0)
            {
                x.add(ac);
                count--;
            }
        }
        List<Integer> y= new ArrayList<>();
        for(int acr : arr1)
        {
            int count=mp2.containsKey(acr)?0:mp.get(acr);
            if(count>0)
            {
                y.add(acr);
                count--;
            }
        }
        Collections.sort(y);
        x.addAll(y);
        return x.stream().mapToInt(i->i).toArray();

    }
}