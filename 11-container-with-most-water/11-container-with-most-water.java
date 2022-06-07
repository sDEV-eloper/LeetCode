class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length;
        int maxA=0,start=0,end=n-1;
        
        while(start<end)
        {
        int start_ht=arr[start];
        int end_ht=arr[end];
        int min_ht=Math.min(start_ht,end_ht);
        maxA=Math.max(maxA,min_ht*(end-start));
            if(start_ht<end_ht)
                start++;
            else
                end--;
        }
        return maxA;
    }
}