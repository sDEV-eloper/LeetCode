class Solution {
    public int maximumWealth(int[][] accounts) {
       int s,mx=0;
        for(int i=0;i<accounts.length;i++){
            s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
         }
             mx=Math.max(mx,s);
        }
        return mx;
    }
}