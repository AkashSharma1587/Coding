package com.learn.problems;

/**
 * Created by akash.sharma on 21/08/17.
 */
public class StringCompression {

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
