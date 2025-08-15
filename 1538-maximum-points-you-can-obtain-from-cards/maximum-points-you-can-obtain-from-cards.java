class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        int n=cardPoints.length;
        int l=0;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
            maxsum=leftsum;
        }
         int r=n-1;
        for(int i=k-1;i>=0;i--){
            
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
    }
}