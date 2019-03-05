package com.learn;

import com.learn.algorithms.dp.LongestRepeatedSubsequence;

public class Main {

    public static void main(String[] args) {

        /*List<Integer> inputList = Arrays.asList(new Integer[]{1,2,3,4,5,6,7});
        LL<Integer> linkedList = new LL<Integer>(inputList);
        linkedList.print();
        linkedList.rotate(2,false);
        linkedList.print();*/

        //System.out.println(LCS.findLCS("ABCDEFC","PQRSADCB"));
        System.out.println(LongestRepeatedSubsequence.findLRS("AAB"));


    }


}
