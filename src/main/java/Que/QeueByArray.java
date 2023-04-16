package Que;

public class QeueByArray {

 static class Queue1{

    static int arr[];

    static int size;

    static int rear=-1;

    static int front=-1;

    Queue1(int size)
    {
        arr=new int[size];//5
        this.size=size;//5
    }

    //isEmpty: checks whether array is empty or not
    public static boolean isEmpty()
    {
        return rear==-1;
    }

    //add
    public static void enqueue(int value) {
        if (rear == size-1) {
            System.out.println("Array is full");
            return;
        } else{
            rear++;
        //front++;//optional   a[0]
        arr[rear] = value;
    }
    }

    //dequeue or delete or remove

    public static int dequeue()
    {
        if(isEmpty())
        {
            return -1;
        }
        else {
            int firstElement = arr[0];

            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return firstElement;
        }
    }

    //peek: look into first element
    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        else {
            return arr[0];
        }
    }

}

    public static void main(String[] args)
    {
        Queue1 q= new Queue1(5);
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
