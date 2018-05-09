package com.learn.algorithms.dp;

import com.sun.tools.javac.util.StringUtils;

/**
 * Created by akash.sharma on 09/05/18.
 */
public class LCS {
    public int findLCS(String x, String y){
        if(x==null || x.isEmpty() || y==null || y.isEmpty()){
            return -1;
        }

        int m = x.length();
        int n = y.length();

        int L[][] = new int[m+1][n+1];


    }
}
