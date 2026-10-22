class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            while(i<j&& !alphanum(s.charAt(i)))
            {
                i++;
            }
            while(j>i&&!alphanum(s.charAt(j)))
            {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=
            Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    private boolean alphanum(char c)
    {
        if('A'<=c&&c<='z'||c>='a'&&c<='z'||c>='0'&&c<='9')
        {
            return true;
        }
        return false;
    }
}
