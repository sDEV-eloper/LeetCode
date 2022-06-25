class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxc=0;
        HashSet<Character> check=new HashSet();
         
        while(right<s.length()){
            char c=s.charAt(right);
            if(check.add(c)){
            int max=right-left+1;
                maxc=Math.max(maxc,max);
                right++;
            }
            else{
                while(s.charAt(left)!=c){
                check.remove(s.charAt(left));
                    left++;
                }
                check.remove(c);
                left++;
            }
        }
        return maxc;
    }
}