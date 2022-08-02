class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]",""); 
        int len=s.length();
        char[] str = s.toCharArray();
        int count=0;
        for(int i=0;i<len/2;i++){
            if(str[i]!=str[len-i-1]){
               count++;
                break;
            }
        }
        if(count>0)
            return false;
        else
            return true;
    }
}