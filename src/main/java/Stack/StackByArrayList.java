package Stack;

import java.util.ArrayList;
import java.util.Stack;

class StackByAList {
    static ArrayList<Integer> asl= new ArrayList<>();

    public static boolean isEmpty()
    {
        return asl.isEmpty();

    }
    public static void push(int data)
    {
        asl.add(data);
    }
    public static int peek()
    {
        if(asl.isEmpty())
        {
            return -1;
        }
        else {
            int top = asl.get(asl.size() - 1);
            return top;
        }

    }

    public static int pop()
    {
        if(asl.isEmpty())
        {
            return -1;
        }
        else{
           int top= asl.get(asl.size()-1);
           asl.remove(asl.size()-1);
           return top;
        }
    }

}

//user class
public class StackByArrayList{

    public static void main(String[] args)
    {
     //   StackByAList sls=new StackByAList();
        Stack<Integer> sls=new Stack<>();
        sls.push(20);
        sls.push(30);
        sls.push(40);
        sls.push(50);

        while(!sls.isEmpty())
        {
            System.out.println(sls.peek());
            sls.pop();
        }

    }

}
