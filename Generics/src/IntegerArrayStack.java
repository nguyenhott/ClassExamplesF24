
public class IntegerArrayStack {

    public final Integer Capacity = 100;
    Integer[] stack;
    Integer top;

    public IntegerArrayStack(){

        stack = new Integer[Capacity];
        top = -1;

    }

    public void push(Integer i){
        if(top <= Capacity)
            stack[top+1] = i;
        top += 1;
    }

    public void pop(){
        if(top >= 0)
            top -= 1;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i <= top; i++)
            s += " " + stack[i] + " ";
        return s;
    }
}
