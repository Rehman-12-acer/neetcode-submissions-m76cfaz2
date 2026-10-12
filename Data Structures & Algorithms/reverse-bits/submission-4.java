class Solution {
    /**
    so i would get a bit value and i position of n then
     >> it to get to the next bit each time and the bit that 
     captured i have to put to the 31-i position in the new 
     bit  
    **/
    public int reverseBits(int n) {
        int res=0;

        for(int i=0;i<32;i++)
        {
            int bit=(n>>i)&1;
            res+=(bit<<(31-i));
        }
        return res;
    }
}
