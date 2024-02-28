package com.epam.utils;


public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        boolean res = org.apache.commons.lang3.StringUtils.isNumeric(str);
        return res;
    }
}
