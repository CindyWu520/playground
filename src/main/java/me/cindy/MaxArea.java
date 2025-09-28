package me.cindy;

import java.util.HashMap;

public class MaxArea {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int j = i + 1;
            int area;
            int minHeight;
            while (j < height.length) {
                // get the min height of two points
                minHeight = Math.min(height[i], height[j]);
                // get the 2 points of area
                area = getArea(i, j, minHeight);
                j++;
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    private int getArea(int i, int j, int height) {
        return (j - i)*(height);
    }
}
