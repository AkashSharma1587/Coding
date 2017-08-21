package com.learn;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s  = "Hello World";
        Node n = convertStringToLinkedList(s);
        printLinkedList(n);

    }

    static class Node {
        char val;
        Node next;
    }

    public static Node convertStringToLinkedList(String str) {
        if (str == null || str.length() == 0)
            return null;

        Node head = new Node();
        Node temp = new Node();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (i == 0) {
                head.val = c;
                head.next = null;
                temp = head;
            } else {
                Node newNode = new Node();
                newNode.val = c;
                newNode.next = null;
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;

    }

    public static void printLinkedList(Node n){
        if(n == null){
            System.out.println("Null Node");
        }
        else{
            Node temp = n;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }
    }

    public static Node reverseWordsInLinkedList(Node n, char separator) {
        if(n == null)
            return null;

        //Iterate the LL and find separators

        Node temp = n;
        ArrayList<Node> listHeads = new ArrayList<Node>();
        while(temp != null){
            if(temp.val == separator){
                Node sep = temp;
                while(sep.val == separator && sep!=null){
                    sep = sep.next;
                }
                temp = sep;
            }
            listHeads.add(temp);
        }



    }
}
