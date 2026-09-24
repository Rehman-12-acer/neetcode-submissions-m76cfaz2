class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0) return Arrays.asList(1);

        List<Integer> cur=new ArrayList<>(Arrays.asList(1));
        List<Integer> prev=getRow(rowIndex-1);

        for(int i=1;i<rowIndex;i++)
        {
            cur.add(prev.get(i-1)+prev.get(i));
        }
        cur.add(1);
        return cur;
    }
    /***
    getrow(3)
        cur=1
        prev=getrow(2) curr(1,2,1)
        1<3
        cur.add(pre(0)+prev1)->1+2
        i++ then 2+1 loop exterminated 
        then add 1 returns 1,3,3,1
            getrow(2)
                cur=1
                prev=getrow(1)==[1,1]
                1<2 from 1-i form prevrow 
                1+1 ,2
                return [1,2,1]
                add==1 then add(1)
                    getrow(1)
                        cur=1
                        prev=getrow(0)==arr[1]
                        1<1 we add all i-1+i
                        then add.1
                        (1,1)
                        return currow here it will return 1
                            getrow(0)
                                return arr[1]
    ***/
}