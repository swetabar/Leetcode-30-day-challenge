package dayThree;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return 0;
        int sum = nums[0];
        int maxSum = sum;
        for(int i = 1; i < nums.length; i++) {
            if(sum + nums[i] < nums[i]) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
