package com.epam.utils;


public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        boolean res = org.apache.commons.lang3.math.NumberUtils.isCreatable(str);
        if(res) {
            if(str.charAt(0) == '+' || str.charAt(0) == '-') res = false;
        }
        return res;
    }
}
