/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));
        int n=intervals.size();
        for(int i=1;i<n;i++)
        {
            Interval a=intervals.get(i-1);
            Interval b=intervals.get(i);
            if(a.end>b.start)
            {
                return false;
            }
        }
        return true;
    }
}
