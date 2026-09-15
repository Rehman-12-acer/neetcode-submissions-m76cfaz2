class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<int[]> p= new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            int g=Math.abs(arr[i]-x);
            int [] al= new int [2];
            al[0]=g;
            al[1]=i;
            p.add(al); 
        }
        PriorityQueue<int []> q= new
        PriorityQueue<>((a,b)->a[0]==b[0]?       
        Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));

        for(int i=0;i<arr.length;i++)
        {
            q.offer(p.get(i));
        }
        List<Integer> y=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            int [] l=q.poll();;
            y.add(arr[l[1]]);
        }
        Collections.sort(y);
        return y;
    }
}