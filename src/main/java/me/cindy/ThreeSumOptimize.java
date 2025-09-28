package me.cindy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimize {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null && nums.length < 3) return result;

        Arrays.sort(nums); // nlog(n)

        for (int i = 0; i < nums.length - 2; i++) {
            // skip the duplicate
            if (i> 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // skip the duplicate for left and right
                    while (left < right && nums[left] == nums[left - 1]) left++; // not if
                    while (left < right && nums[right] == nums[right + 1]) right--; // not if
                } else if (sum < 0) {
                    left++; // need bigger number
                } else {
                    right--; // need smaller number
                }
            }

        }
        return result;
    }
}
