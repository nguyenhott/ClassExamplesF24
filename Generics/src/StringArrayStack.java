
public class StringArrayStack {

    public final Integer Capacity = 100;
    String[] stack;
    Integer top;

    public StringArrayStack(){

        stack = new String[Capacity];
        top = -1;

    }

    public void push(String i){
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
