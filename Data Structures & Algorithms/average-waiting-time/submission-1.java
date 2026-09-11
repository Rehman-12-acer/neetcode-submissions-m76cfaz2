class Solution {
    public double averageWaitingTime(int[][] customers) {
        long t=0;
        long total=0;
        for(int [] ar : customers)
        {
            int arr=ar[0],order=ar[1];
            if(t>arr)
            {
                total+=t-arr;
            }
            else
            {
                t=arr;
            }
            total+=order;
            t+=order;
        }
        return (double) total/customers.length;
    }
}