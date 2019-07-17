package com.learn.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by akash.sharma on 02/12/17.
 */
public class RemoveCharForAnagrams {

    public static int numberNeeded(String first, String second) {
        int numCharToDelete = 0;
        int noOfRemainingElements = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        if(first!=null && first.length()>0){
            int count = first.length() - 1;
            while(count >= 0){
              char ch = first.charAt(count);
              if(hm.containsKey(ch)){
                  hm.put(ch, 1+hm.get(ch));
              }
                else{
                  hm.put(ch,1);
              }
                count = count - 1;
            }
        }

        if(second!=null && second.length() > 0){
            int count = second.length() - 1;
            while(count >= 0){
                char ch = second.charAt(count);
                if(!hm.containsKey(ch)){
                    numCharToDelete+=1;
                    count = count - 1;
                    continue;
                }
                else if (hm.containsKey(ch) && hm.get(ch)>0){
                    int update = hm.get(ch) - 1;
                    if (update == 0){
                        hm.remove(ch);
                    }else {
                        hm.put(ch, update);
                    }
                }
                else{
                    numCharToDelete+=1;
                    count = count - 1;
                    continue;
                }

                count = count - 1;

            }
        }
        if(hm.size() > 0){
            String st;
            Iterator it = hm.keySet().iterator();
            while(it.hasNext()){
                Character ch = (Character) it.next();
                noOfRemainingElements += hm.get(ch);
            }
        }
        return numCharToDelete + noOfRemainingElements;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
