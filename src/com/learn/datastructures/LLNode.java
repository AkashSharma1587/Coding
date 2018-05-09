package com.learn.datastructures;

/**
 * Created by akash.sharma on 22/08/17.
 */

public class LLNode<T> {
    public LLNode<T> getNext() {
        return next;
    }

    public void setNext(LLNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    LLNode<T> next;
    T data;

    public LLNode(T data){
        this.data = data;
        this.next = null;
    }

}
