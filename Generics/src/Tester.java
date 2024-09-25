public class Tester {

    public static void main(String[] args){
        /*Dancer dancer = new Dancer();
        dancer.shake(4.0);
        dancer.shake(1);
        dancer.shake("left arm");
        */

        //stack
        GenericArrayStack<Integer> myIntegerStack = new GenericArrayStack<>();
        myIntegerStack.push(10);
        myIntegerStack.push(15);
        myIntegerStack.push(1);
        myIntegerStack.push(100);
        System.out.println(myIntegerStack);
        myIntegerStack.pop();
        System.out.println(myIntegerStack);

        GenericArrayStack<String> myStringStack = new GenericArrayStack<>();
        myStringStack.push("Shakira");
        myStringStack.push("Taylor");
        System.out.println(myStringStack);
    }
}
