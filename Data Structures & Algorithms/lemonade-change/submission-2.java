class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;

        for(int p : bills)
        {
            if(p==5)
            {
                five++;
            }
            else if(p==10)
            {
                ten++;
                if(five >0)
                {
                    five --;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(ten>0&&five > 0)
                {
                    ten--;
                    five--;

                }
                else if(five >=3)
                {
                    five-=3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}