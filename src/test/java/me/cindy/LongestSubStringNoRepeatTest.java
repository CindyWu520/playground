package me.cindy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubStringNoRepeatTest {

    @Test
    public void test01() {
        String s = "abcabcbb";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test02() {
        String s = "bbbbb";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(1, actual);
    }

    @Test
    public void test03() {
        String s = "pwwkew";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test04() {
        String s = "  fde";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(4, actual);
    }

    @Test
    public void test05() {
        String s = "";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test06() {
        String s = "dvdf";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test07() {
        String s = "dvedfebac";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(6, actual);
    }

    @Test
    public void test08() {
        String s = "cdd";
        int actual = new LongestSubStringNoRepeat().lengthOfLongestSubString(s);

        Assertions.assertEquals(2, actual);
    }
}
