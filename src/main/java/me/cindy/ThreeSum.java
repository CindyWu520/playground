package me.cindy;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class ThreeSum {

    public List<List<Integer>> getThreeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        // the length is three
        if (nums.length == 3) {
            if (nums[0] + nums[1] + nums[2] == 0) {
                result.add(Arrays.asList(nums[0], nums[1], nums[2]));
            }
        }

        // the length is above three
        Arrays.sort(nums);
        Integer iTemp = null;
        Integer jTemp = null;
        for (int i = 0; i < nums.length - 3; i++) {
            if (Objects.equals(iTemp, nums[i])){
                continue;
            }

            for (int j = nums.length - 1; j > i + 1; j--) {
                if (Objects.equals(jTemp, nums[j])){
                    continue;
                }
                int diff = - nums[i] - nums[j];
                int k = j - 1;
                while (i < k && k < j) {
                    if (nums[k] == diff) {
                        result.add(Arrays.asList(nums[i], nums[k], nums[j]));
                        break;
                    } else if (nums[k] < diff) {
                        break;
                    } else {
                        k--;
                    }
                }
                jTemp = nums[j];
            }
            iTemp = nums[i];
        }

        return result;

//        if(result.isEmpty()){
//            throw new RuntimeException("No three numbers sum up to 0");
//        } else {
//            return result;
//        }
    }
}
