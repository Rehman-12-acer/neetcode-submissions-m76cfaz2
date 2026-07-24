class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String str : details)
        {
            if(Integer.parseInt(str.substring(11,13))>60)
            {
                res++;
            }
        }
        return res;
    }
}