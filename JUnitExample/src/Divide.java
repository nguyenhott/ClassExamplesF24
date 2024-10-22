public class Divide {

    //b cannot be zero
    public double divide(double a, double b){
        if(b==0)
            throw new ArithmeticException("b cannot be zero");
        return a/b;
    }

    public String message(int i){
        if(i > 5)
            return "Big";
        else return "Small";
    }

}
