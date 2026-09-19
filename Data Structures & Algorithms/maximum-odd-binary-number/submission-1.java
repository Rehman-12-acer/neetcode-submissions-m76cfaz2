class Solution {
    public String maximumOddBinaryNumber(String s) {
        char [] arr= s.toCharArray();
        int left=0;

        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='1')
            {
                char temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
            }
        }

        char temp=arr[left-1];
        arr[left-1]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        return new String(arr);
    }
}