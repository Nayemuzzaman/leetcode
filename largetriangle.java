import java.lang.reflect.Array;
import java.util.Arrays;
// https://leetcode.com/problems/largest-perimeter-triangle/

// 976. Largest Perimeter Triangle

public class largetriangle {
    public int largestPerimeter(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for (int i = nums.length-3;i>=0;--i) {
            if (nums[i+2]<nums[i+1]+nums[i]) {
                return nums[i]+nums[i+1]+nums[i+2];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        largetriangle lt = new largetriangle();
        int [] numbers = {3,2,3,4};
        int value = lt.largestPerimeter(numbers);
        System.out.println(value);
    }
}
