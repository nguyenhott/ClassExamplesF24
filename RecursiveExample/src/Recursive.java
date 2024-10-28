public class Recursive {

    public static void main(String[] args){
        double result1 = power(2,5);
        double result2 = powerIter(2,5);

        //print linked list
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);
        myList.insert(4);
        printList(myList.head);
        printListIter(myList.head);

        //fibonacci

    }

    public static void printList(Node<Integer> n){
        if(n == null) return;
        else{
            System.out.println(n.data);
            printList(n.next);
        }
    }

    public static void printListIter(Node<Integer> n){
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static long fib(int n){
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static long fibIter(int n){
        if(n <= 2) return 1;
        long prev = 1;
        long curr = 1;
        long result = 0;
        for (int i = 3; i <= n; i++){
            result = prev + curr;
            prev = curr;
            curr = result;
        }
        return result;
    }

    public static double power(double base, int exponent){
        if(exponent == 0) return 1;
        return base * power(base, exponent -1);
    }

    public static double powerIter(double base, int exponent){
        double result = 1;
        for(int i = 0; i < exponent; i++)
        {
            result = result * base;
        }
        return result;
    }
}
