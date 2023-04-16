package Que;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//    int data;
//    Node next;
//    Node(int data, Node next)
//    {
//        this.data=data;
//        this.next=null;
//    }
//}
//
//class Queuell {
//
//    static Node head;
//    static Node tail;
//
//    public void add(int data)
//    {
//        Node newNode=new Node(data, null);
//
//        if(head == null && tail == null)
//        {
//            head=newNode;
//            tail=newNode;
//            return;
//        }
//        else{
//            tail.next=newNode;
//            tail=newNode;
//            return;
//        }
//    }
//
//    public int remove()
//    {
//        if(head == null && tail == null)
//        {
//            return -1;
//        }
//
//        if(head == tail)
//        {
//            tail= null;
//        }
//            int top=head.data;
//            head=head.next;
//            return top;
//
//    }
//
//    public int peek()
//    {
//        if(head == null && tail == null)
//        {
//            return -1;
//        }
//        return head.data;
//    }
//
//    public boolean isEmpty()
//    {
//        if(head == null && tail == null)
//        {
//            return true;
//        }
//        return false;
//    }
//}


public class QeueByLinkedList {
//O(1) ADD,REMOVE,PEEK
    public static void main(String[] args) {
       // Queuell q = new Queuell();
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
