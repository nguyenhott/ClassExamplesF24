public class Recursive {

    public static void main(String[] args){
        int result = power(2,100000);
    }

    public static int power(int base, int exponent){
        if(exponent == 0) return 1;
        return base * power(base, exponent -1);
    }

}
