package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(80);
        pq.add(40);
        pq.add(30);
        pq.add(10);
        pq.add(60);
        pq.add(20);
        pq.add(25);
        pq.add(15);
        pq.add(8);
        while(!pq.isEmpty())
        {
            System.out.print(pq.peek()+ "     ");
            pq.poll();
        }
    }
}
