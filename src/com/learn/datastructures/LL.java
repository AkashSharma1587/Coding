package com.learn.datastructures;

import com.learn.exceptions.BadRequestException;

import java.util.List;

/**
 * Created by akash.sharma on 28/04/18.
 */
public class LL<T> {
    LLNode<T> head;

    public LL(LLNode<T> head) {
        this.head = head;
    }

    public LL(List<T> list) {
        if(list == null || list.size()==0){
            throw new BadRequestException("LinkedList cannot be created with NULL or Empty list");
        }

        int i = 0;
        LLNode tail = null;
        for(T item: list){
           LLNode node = new LLNode(item);
           if(i == 0) {
               i = 1;
               this.head = node;
               tail = node;
           }
            else {
               tail.setNext(node);
               tail = node;
           }
        }
    }

    public int length(LLNode node){
        if(node == null){
            throw new BadRequestException("Input node is null, cannot determine length");
        }
        LLNode temp = head;
        int count = 1;
        while(temp.getNext()!=null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public int length() {
        if(this.head == null){
            throw new BadRequestException("HEAD node is null, cannot determine length");
        }
        return length(this.head);
    }

    public void print(){
        print(this.head);
    }

    public void print(LLNode inputNode){
        LLNode<T> node = inputNode;
        System.out.print("[");
        while(node != null) {
            System.out.print(node.getData() + " -> ");
            node = node.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public void append(T newData){
        LLNode newNode = new LLNode(newData);
        LLNode node = head;
        while(node.next != null){
            node = node.next;
        }

        node.next = newNode;
    }

    public LLNode<T> findCentralNode(){
        LLNode fast = head;
        LLNode slow = head;

        if(head.next == null)
            return head;

        while(fast!=null && slow!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public LLNode<T> findLoopNode(){
        LLNode<T> fast = head;
        LLNode<T> slow = head;

        if(this.head == null)
            return head;

        while(fast!=null && slow!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                System.out.println("There is a loop at data node = "+slow.data);
                return slow;
            }
        }
        System.out.println("There is no loop in the LinkedList");
        return null;

    }

    public LLNode<T> reverse(){
        if(head == null || head.getNext()==null)
            return head;
        else
            return reverse(head);

    }

    private LLNode<T> reverse(LLNode<T> node){
        System.out.print("Reversing :: ");
        this.print(head);
        if(node == null || node.getNext()==null)
            return node;
        else
        {
            LLNode first = node;
            LLNode second = node.getNext();
            while(second.getNext()!=null){
                 first = first.getNext();
                 second = second.getNext();
            }
            first.setNext(null);
            second.setNext(reverse(node));
            this.head = second;
            return second;

        }

    }

    public LL duplicate(){
        if(this.head == null)
            return null;

        LLNode temp = head;
        LLNode tail = null;
        boolean newHeadChosen = false;
        LLNode newHead = null;
        while(temp!=null) {
            LLNode newNodeTmp = new LLNode(temp.getData());
            if(!newHeadChosen){
                newHead = newNodeTmp;
                tail = newNodeTmp;
                newHeadChosen = true;
            }
            else {
                tail.setNext(newNodeTmp);
                tail = newNodeTmp;
                temp = temp.getNext();
            }
        }
        return  new LL(newHead);
    }

    public boolean isPalindrome(boolean inPlace){

        if(!inPlace){
            LL duplicateLL = this.duplicate();
            LLNode reverseNode =  duplicateLL.reverse();
            LLNode tempFwd = this.head;
            LLNode tempRev = reverseNode;
            while(tempFwd!=null && tempRev!=null && tempFwd.getData() == tempRev.getData()){
                tempFwd = tempFwd.getNext();
                tempRev = tempRev.getNext();
            }
            if(!(tempFwd!=null && tempRev!=null))
                return false;
            else
                return true;
        }
        else{
            int n = this.length();
            int count = 1;
            int k = 0;
            while(count <= n/2){

            }
        }
        return false;
    }

    public void rotate(int k, boolean anticlockwise){
      if(this.head == null){
          throw new BadRequestException("Head is NULL");
      }

      int len = this.length();
      k = k%len;

      if(k == 0)
          return;

      int count = 1;
        LLNode temp = head;

      if(!anticlockwise){
          while(count < (len-k)){
              temp = temp.getNext();
              count++;
          }
      }
      else{
          while(count < k){
              temp = temp.getNext();
              count++;
          }
      }

      LLNode newHead = temp.getNext();
      temp.setNext(null);
      LLNode endNode = newHead;
      while(endNode.getNext()!=null){
          endNode = endNode.getNext();
      }
      endNode.setNext(this.head);
      this.head = newHead;
    }

    public LL zip(){
        return null;

    }

    public void removeLoop(){
    }

    public LL addNumber(LL input){
        return null;
    }
}
