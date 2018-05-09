package com.learn;

import com.learn.datastructures.LL;
import com.learn.datastructures.LLNode;
import com.learn.problems.MarkZerosInMatrix;
import com.learn.problems.StringCompression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputList = Arrays.asList(new Integer[]{1,2,3,4,5,6,7});
        LL<Integer> linkedList = new LL<Integer>(inputList);
        linkedList.print();
        linkedList.rotate(2,false);
        linkedList.print();


    }


}
