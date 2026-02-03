
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<k;i++) {
            sum=sum+nums[i];
        }
        double Maxsum=sum;
        for(int i=k;i<nums.length;i++) {
            sum=sum-nums[i-k]+nums[i];
            Maxsum=Math.max(Maxsum,sum);
        }
        return Maxsum/k;
        
    }
}