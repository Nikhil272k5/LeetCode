class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
       int n=happiness.length;
       int count=0;
       long ans=0;
       for(int i=n-1;i>=0;i--){
        if(k>=1 && happiness[i]-count>0){
            ans+=happiness[i]-count;
        }
        count++;
        k--;

       }
       return ans;
        
    }
}