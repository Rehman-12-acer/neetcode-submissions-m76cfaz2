class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res= new ArrayList<>();
        PriorityQueue<int []> pq= new PriorityQueue<>((a,b)->
        {
            if(a[0]!=b[0])
            {
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });

        int [] diff= new int [arr.length];

        for(int i=0;i<arr.length;i++)
        {
            diff[i]=Math.abs(arr[i]-x);
        }

        for(int j=0;j<arr.length;j++)
        {
            int [] s=new int [2];
            s[0]=diff[j];
            s[1]=arr[j];
            pq.offer(s);
        }

        for(int i=0;i<k;i++)
        {
            int [] r=new int [2];
            r=pq.poll();
            res.add(r[1]);
        }
        Collections.sort(res);
        return res;
    }
}