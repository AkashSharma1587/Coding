package com.learn.algorithms.dp;

import static java.lang.Math.max;

/**
 * Created by akash.sharma on 09/05/18.
 */

/** Longest Common Subsequence **/

public class LCS {
    public static int findLCS(String x, String y){
        if(x==null || x.isEmpty() || y==null || y.isEmpty()){
            return -1;
        }

        int m = x.length();
        int n = y.length();

        char [] X = x.toCharArray();
        char [] Y = y.toCharArray();

        return lcs(X,m,Y,n);



    }

    private static int lcs(char [] X, int m, char [] Y, int n){
        int L[][] = new int[m+1][n+1];
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i<=m ; i++){
            for(int j = 0; j<=n ; j++){
                if(i==0 || j==0){
                    L[i][j] = 0;
                }
                else if(X[i-1] == Y[j-1]){
                    L[i][j] = 1 + L[i-1][j-1];
                }
                else{
                    L[i][j] = max(L[i][j-1], L[i-1][j]);
                }
                System.out.print(" "+L[i][j]);
            }
            System.out.println();
        }

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X[i - 1] == Y[j - 1]) {
                sb.append(X[i - 1]);
            }
            if (L[i - 1][j] > L[i][j - 1]) {
                i = i - 1;
            } else {
                j = j - 1;
            }

        }


        System.out.println(sb.reverse().toString());
        return L[m][n];


    }


}
