public class Tester {

    public  static void main(String[] args){

        //widening cast
        byte b = 8;
        short s = b;
        System.out.println("s = " + s);

        //Narrowing cast
        short s1 = 354;
        byte b1 = (byte) s1;
        System.out.println("b1 = " + b1);
    }
}
