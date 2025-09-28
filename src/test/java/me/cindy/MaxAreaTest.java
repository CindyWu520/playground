package me.cindy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxAreaTest {
    @Test
    public void test01() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int actual = new MaxArea().maxArea(height);

        Assertions.assertEquals(49, actual);
    }

    @Test
    public void test02() {
        int[] height = {1,1};
        int actual = new MaxArea().maxArea(height);

        Assertions.assertEquals(1, actual);
    }
}
