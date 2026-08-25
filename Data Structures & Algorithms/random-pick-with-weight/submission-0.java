class Solution {
    int [] w;
    int total;
    public Solution(int[] w) {
        this.w=w;
        for(int we : w)
        {
            total+=we;
        }
    }

    public int pickIndex() {
        double target=total*Math.random();
        int cursum=0;
        for(int i=0;i<w.length;i++)
        {
            cursum+=w[i];
            if(cursum>target)
            {
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */