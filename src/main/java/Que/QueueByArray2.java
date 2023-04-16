package Qu;


class Queue{
	//array which will be acting as queue
	static int arr[];
	
	//hold the max value limit current array will allow
	static int size;
	
	//starting and ending pointers for queue
	static int rear=-1;
	
	// not required as it is always return a[0]
	static int front=-1;
	
	//Queue constructor, creates array with given size
	Queue(int size)
	{
		arr=new int[size];
		this.size=size;
	}
	
	
	//checks whether a queue is empty or not
	public static boolean isEmpty()
	{
		//if rear is still in stating position
		//then the queue is empty
		return rear==-1;
	}
	
	//add O(1)
	public static void enqueue(int value)
	{
		//array is full
		//rear touched the last index of array
		if(rear == size-1)
		{
			System.out.println("Array is full!!");
			return;
		}
		else {
			//from -1 it will become 1
			rear++;
			arr[rear]=value;
		}
		
	}
	
	//deleting a value from queue
	//TC:O(N)
	public static int dequeue()
	{
		//array is empty can't remove
		if(isEmpty())
		{
			return -1;
		}
		else {
			int top=arr[0];
			
			//move all the back elements to front
			//performing operation for n
			//number of elements 
			for(int i =0; i < rear; i++)
			{
				arr[i]=arr[i+1];
			}
			//as 1 element is deacresed so must rear front
			rear--;
			
			return top;
		}
	}
	
	//O(1)
	public static int peek()
	{
		//array is empty can't remove
		if(isEmpty())
		{
			return -1;
		}
		else {
		return arr[0];
		}
	}
	
}

public class QueueByArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		while(! q.isEmpty())
		{
			System.out.println(q.peek());
			q.dequeue();
		}

	}

}
