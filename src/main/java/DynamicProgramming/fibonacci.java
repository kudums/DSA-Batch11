package DynamicProgramming;

public class fibonacci {

static int[] arr=new int[1000];
    //TC:O(2^n)
    int fib(int n)
   {
       if(n <=1)
       {
           return n;
       }
       return fib(n-1)+fib(n-2);
   }
//meomorization => top-down approach
    //TC:O(N+1)=>O(N)
    //SC:O(N+1)

    int fibMem(int n)
    {
        if(n <=1)
        {
            return n;
        }
        if(arr[n]!=0)
        {
            return arr[n];
        }
        else{
            arr[n]=fibMem(n-1)+fibMem(n-2);
            return arr[n];
        }
    }

    //TC:O(N+1)=>O(N)
    //SC:O(N+1)
    //bottom-up/ down to top approach
    //Tabulization
    int fibTab(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i <= n; i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args)
    {
        fibonacci fb=new fibonacci();

        System.out.println("******Normal Recursive*******");
        System.out.println(fb.fib(4));

        System.out.println("****Memorization Recusive******");
        System.out.println(fb.fibMem(5));


        System.out.println("********Tabulization Recursive******");
        System.out.println(fb.fibTab(6));

    }

}
