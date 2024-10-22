import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Greeting{

    void sayGreeting(String msg);
}

public class LambdaExpression {

    // (params) -> {statements;}
    public static void main(String[] args) {


    Greeting g =
            (m) -> {

                System.out.println("Say greeting " + m);
            };

        g.sayGreeting("hello ");

    }
}
