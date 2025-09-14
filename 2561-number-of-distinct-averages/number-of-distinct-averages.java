class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        double ans=0;
        int n=nums.length;
        int l=0;
        int r=n-1;
        HashSet<Double>hs=new HashSet<>();
        while(l<=r){
            ans=(nums[l]+nums[r])/2.0;
            hs.add(ans);
            l++;
            r--;
           

        }

        return hs.size();
    }
}