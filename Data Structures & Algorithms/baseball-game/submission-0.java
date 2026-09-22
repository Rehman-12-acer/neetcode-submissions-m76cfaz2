class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s= new Stack<>();
        for(String str:operations)
        {
            if(str.equals("+"))
            {
                int top= s.pop();
                int newt=top+s.peek();
                s.push(top);
                s.push(newt);
            }
            else if(str.equals("D"))
            {
                s.push(2*s.peek());
            }
            else if (str.equals("C"))
            {
                s.pop();
            }
            else
            {
                s.push(Integer.parseInt(str));
            }
        }
        int score=0;
        for(int k: s)
        {
            score+=k;
        }
        return score;
    }
}