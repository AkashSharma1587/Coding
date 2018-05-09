package com.learn.problems;

import com.learn.exceptions.BadRequestException;

/**
 * Created by akash.sharma on 22/08/17.
 */
public class MarkZerosInMatrix {
    public static void convert(int [][] input) throws BadRequestException{
        if(input == null){
            throw new BadRequestException("Input matrix cannot be null");
        }

        int [] rows = new int[input.length];
        int [] columns = new int[input[0].length];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j<input[0].length; j++){
                if(input[i][j] == 0){
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }

        for(int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (rows[i] == 1 || columns[j] == 1) {
                    input[i][j] = 0;
                }
                System.out.print(input[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
