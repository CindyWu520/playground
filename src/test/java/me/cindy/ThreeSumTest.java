package me.cindy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumTest {

    @Test
    public void ThreeNumsSumToZeroTest() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = new ThreeSum().getThreeSum(nums);

        assertEquals(expected, actual);
    }

    @Test
    public void throwExceptionTest() {
        int[] nums = new int[]{0, 1, 1};

        List<List<Integer>> actual = new ThreeSum().getThreeSum(nums);

//        assertThrows(RuntimeException.class, () -> {
//            new ThreeSum().getThreeSum(nums);
//        });

        assertTrue(actual.isEmpty());
    }

    @Test
    public void mutiSumToZeroTest() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,0,1));
        expected.add(Arrays.asList(-1,-1,2));
        List<List<Integer>> actual = new ThreeSum().getThreeSum(nums);

        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    public void fourZero() {
        int[] nums = new int[]{0, 0, 0, 0};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0));
        List<List<Integer>> actual = new ThreeSum().getThreeSum(nums);

        assertEquals(expected, actual);
    }

}
