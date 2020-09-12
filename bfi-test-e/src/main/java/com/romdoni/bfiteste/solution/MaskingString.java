package com.romdoni.bfiteste.solution;

public class MaskingString {
    public String mask(String original) {
        String[] words = original.split(" ");
        String[] chars =new String[0];
        StringBuilder result= new StringBuilder();

        for (String s : words) {
            if (s.length() > 2) {
                chars = s.split("");
                for (String value : chars) {
                    if (value.equals(chars[0]) || value == chars[chars.length - 1]) {
                        result.append(value);
                    } else {
                        result.append("*");
                    }
                }
            } else {
                result.append(s);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
