package dayFour;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int digit = 0;
        while(zero < nums.length && digit < nums.length) {
            while(zero < nums.length && nums[zero] != 0)
                zero++;
            digit = zero;
            while(digit < nums.length && nums[digit] == 0)
                digit++;
            if(zero == nums.length || digit == nums.length)
                break;
            swap(nums, zero, digit);
        }

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
