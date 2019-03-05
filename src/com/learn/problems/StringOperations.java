package com.learn.problems;

import java.util.HashMap;
import java.util.List;

public class StringOperations {

    public static List<String> findAllPermutations(String s){
        if(s == null || s.length() < 1){
            return null;
        }
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray()){
            if(hm.containsKey(ch)){
                Integer count = (Integer) hm.get(ch);
                count = count + 1;
                hm.put(ch, count);
            }
            else{
                hm.put(ch, 1);
            }
        }


        return null;
    }

    public static String compress(String input){

        if(input == null){
            return input;
        }

        int len = input.length();
        if( len==0 || len==1 || len==2)
            return input;

        StringBuilder sb = new StringBuilder();
        int i = 0;
        char currentChar;
        while(i < len){
            currentChar = input.charAt(i);
            int j = i + 1;
            while (j < len && input.charAt(j) == currentChar){
                j++;
            }

            if(j <= len){

                int count = j - i;
                i = j;
                sb.append(currentChar).append(count);
            }
        }

        if(sb.length() < len)
            return sb.toString();
        else
            return input;
    }
}
