package com.leetcode.easy;

import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-05-12
 * @time: 12:54
 */
public class T155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }


}

class MinStack {

    private Stack<Integer> stack;

    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
            return;
        }
        Integer v = minStack.peek();
        if( v > x){
            minStack.push(x);
        }else {
            minStack.push(v);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}