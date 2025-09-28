package me.cindy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LongestSubStringNoRepeat {
    public int lengthOfLongestSubString(String s) {
        if (s.isEmpty()) return 0;
        if (s.isBlank()) return 1;

        int maxLength = 0;
        int resultTemp = 0;
        StringBuilder window = new StringBuilder();
        String charString;

        for (int i = 0; i < s.length(); i++) {
            // iterate the string
            charString = String.valueOf(s.charAt(i));

            // does not contain charString
            if (window.indexOf(charString) == -1) {
                window.append(charString);
                resultTemp++;
            } else {
                window.delete(0, window.indexOf(charString) + 1)
                        .append(charString);

                resultTemp = window.length();
            }
            maxLength = Math.max(resultTemp, maxLength);
        }
        return maxLength;
    }
}
