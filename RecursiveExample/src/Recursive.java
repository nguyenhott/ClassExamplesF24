public class Recursive {

    public static void main(String[] args){
        double result = power(2,100000);
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
