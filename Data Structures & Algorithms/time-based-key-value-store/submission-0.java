class TimeMap {
    
    private Map<String,List<Pair>> map;


    public TimeMap() {
         map= new HashMap<>() ;   
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key,k->new ArrayList<>()).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> list= map.get(key);
        int l=0,r=list.size()-1;
        String result="";
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(list.get(mid).timestamp<=timestamp)
            {
                l=mid+1;
                result=list.get(mid).value;
            }
            else
            {
                r=mid-1;
            }
        }
        return result;

    }
    private static class Pair
    {
        String value;
        int timestamp;

        Pair(String value,int timestamp)
        {
            this.value=value;
            this.timestamp=timestamp;
        }
    }
}
