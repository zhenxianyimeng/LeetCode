package com.jianzhioffer.t09;

import java.util.Stack;

/**
 * Description:
 *
 * @author: chixiao
 * @date: 2020-06-30
 * @time: 21:05
 */
class CQueue {

    private Stack<Integer> stack1;

    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }
        if(!stack1.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty()? -1 : stack2.pop();
    }


    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
//        cQueue.appendTail(3);
//        System.out.println(cQueue.deleteHead());
//        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}