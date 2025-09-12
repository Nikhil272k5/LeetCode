class Solution {
    public int maximizeSum(int[] nums, int k) {
        int sum=0;
        Arrays.sort(nums);
        int n=nums.length;
        int r=nums[n-1];
        while(k!=0){
            sum+=r;
            r++;
            k--;
        }
        return sum;
    }
}