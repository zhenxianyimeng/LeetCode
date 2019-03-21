package com;

import java.util.List;

/**
 * @author zjb
 * @date 2019/3/17.
 */
public class QuickSort {

    public static void main(String[] args) {
        Node node = new Node(4);
        node.next = new Node(3);
        node.next = new Node(2);
        node.next = new Node(1);
        QuickSort quickSort = new QuickSort();
        quickSort.sortMain(node);
        while (node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

    public void sortMain(Node head){
        sort(head, null);
    }

    public void sort(Node start, Node end){
//        Node start = head;
//        Node end = null;
        Node middle = partition(start, end);
        sort(start, middle);
        sort(middle.next, end);
    }

    public Node partition(Node start, Node end){
        Node k = start.next;
        Node i = start.next;
        while (i.next!=null && i.next != end ){
            if(i.value > start.value){
                i = i.next;
            }else {
                int temp = k.value;
                k.value = i.value;
                i.value = temp;
                k = k.next;
                i = i.next;
            }
        }
        int temp = i.value;
        i.value = start.value;
        start.value = temp;
        return i;
    }


}

class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
